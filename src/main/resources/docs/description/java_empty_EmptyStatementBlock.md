Since: PMD 5.0

Empty block statements serve no purpose and should be removed.

Example(s):
```
public class Foo {

   private int _bar;

   public void setBar(int bar) {
      { _bar = bar; } // Why not?
      {} // But remove this.
   }

}
```

[Source](https://pmd.github.io/pmd-5.6.1/pmd-java/rules/java/empty.html#EmptyStatementBlock)
