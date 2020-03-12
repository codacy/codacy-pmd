Since: PMD 5.5.0

Excessive class file lengths are usually indications that the class may be burdened with excessive
responsibilities that could be provided by external classes or functions. In breaking these methods
apart the code becomes more managable and ripe for reuse.

Example(s):
```
public class Foo {
    public void bar1() {
        // 1000 lines of code
    }
    public void bar2() {
        // 1000 lines of code
    }
    public void bar3() {
        // 1000 lines of code
    }
    public void barN() {
        // 1000 lines of code
    }
}
```
