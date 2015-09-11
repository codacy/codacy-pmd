Code should never throw `NullPointerExceptions` under normal circumstances. A catch block may hide the original error, causing other, more subtle problems later on.

Ex:

```
public class Foo {
  void bar() {
    try {
    // do something
    } catch (NullPointerException npe) {

    }
  }
}
```

[Source](https://pmd.github.io/pmd-5.3.3/pmd-java/rules/java/strictexception.html#AvoidCatchingNPE)
