Since: PMD 6.0.0

Empty block statements serve no purpose and should be removed.

Example(s):
```
public class Foo {

   private Integer _bar;

   public void setBar(Integer bar) {
        // empty
   }

}
```
