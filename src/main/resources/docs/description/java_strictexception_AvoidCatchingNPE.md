Since: PMD 1.8

Code should never throw NullPointerExceptions under normal circumstances.  A catch block may hide the 
original error, causing other, more subtle problems later on.

Example(s):
```
public class Foo {
  void bar() {
    try {
      // do something
      }  catch (NullPointerException npe) {
    }
  }
}
```

[Source](https://pmd.github.io/pmd-5.5.4/pmd-java/rules/java/strictexception.html#AvoidCatchingNPE)
