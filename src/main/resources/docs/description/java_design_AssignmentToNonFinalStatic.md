Since: PMD 2.2

Identifies a possible unsafe usage of a static field.

Example(s):
```
public class StaticField {
   static int x;
   public FinalFields(int y) {
    x = y; // unsafe
   }
}
```
