Empty block statements serve no purpose and therefore should be removed.

Ex:

```
public class Foo {
  private int _bar;

  public void setBar(int bar) {
    {
      _bar = bar; // Why not?
    }
    {
      // But remove this.
    }
  }
}
```

[Source](http://pmd.sourceforge.net/pmd-5.3.2/pmd-java/rules/java/empty.html#EmptyStatementBlock)
