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
