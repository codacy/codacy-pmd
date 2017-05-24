Since: PMD 5.0

Useless parentheses should be removed.

Example(s):
```
public class Foo {

   private int _bar1;
   private Integer _bar2;

   public void setBar(int n) {
      _bar1 = Integer.valueOf((n)); // here
      _bar2 = (n); // and here
   }

}
```
