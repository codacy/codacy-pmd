Since: PMD 6.24.0

This rule detects when a cast is unnecessary while accessing collection elements. This rule is mostly useful
for old java code before generics where introduced with java 1.5.

Example(s):
```
public class UnnecessaryCastSample {
    public void method() {
        List<String> stringList = Arrays.asList("a", "b");
        String element = (String) stringList.get(0); // this cast is unnecessary
        String element2 = stringList.get(0);
    }
}
```
