Since: PMD 3.0

Switch statements without break or return statements for each case option
may indicate problematic behaviour. Empty cases are ignored as these indicate an intentional fall-through.

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
      case REMOVED:
        doRemoved();
        // what happens if you add another case after this one?
      case OTHER: // empty case - this is interpreted as an intentional fall-through
      case ERROR:
        doErrorHandling();
        break;
    }
}
```
