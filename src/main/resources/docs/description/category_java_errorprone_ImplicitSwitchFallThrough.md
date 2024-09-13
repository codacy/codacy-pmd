Since: PMD 3.0

Switch statements without break or return statements for each case option
may indicate problematic behaviour. Empty cases are ignored as these indicate
an intentional fall-through.

You can ignore a violation by commenting `// fallthrough` before the case label
which is reached by fallthrough, or with `@SuppressWarnings(&quot;fallthrough&quot;)`.

This rule has been renamed from &quot;MissingBreakInSwitch&quot; in PMD 6.37.0.

Example(s):
```
public void bar(int status) {
    switch(status) {
      case CANCELLED:
        doCancelled();
        // break; hm, should this be commented out?
      case NEW:
        doNew();
        // is this really a fall-through?
        // what happens if you add another case after this one?
      case REMOVED:
        doRemoved();
        // fallthrough - this comment just clarifies that you want a fallthrough
      case OTHER: // empty case - this is interpreted as an intentional fall-through
      case ERROR:
        doErrorHandling();
        break;
    }
}
```
