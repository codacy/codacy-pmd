Since: PMD 1.5

By convention, the default label should be the last label in a switch statement.

Example(s):
```
public class Foo {
  void bar(int a) {
   switch (a) {
    case 1:  // do something
       break;
    default:  // the default case should be last, by convention
       break;
    case 2:
       break;
   }
  }
}
```

[Source](https://pmd.github.io/pmd-5.6.1/pmd-java/rules/java/design.html#DefaultLabelNotLastInSwitchStmt)
