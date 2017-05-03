Since: PMD 1.5

A non-case label (e.g. a named break/continue label) was present in a switch statement.
This legal, but confusing. It is easy to mix up the case labels and the non-case labels.

Example(s):
```
public class Foo {
  void bar(int a) {
   switch (a) {
     case 1:
       // do something
       break;
     mylabel: // this is legal, but confusing!
       break;
     default:
       break;
    }
  }
}
```

[Source](https://pmd.github.io/pmd-5.6.1/pmd-java/rules/java/design.html#NonCaseLabelInSwitchStatement)
