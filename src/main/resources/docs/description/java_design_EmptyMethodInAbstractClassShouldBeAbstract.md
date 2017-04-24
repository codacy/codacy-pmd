Since: PMD 4.1

Empty or auto-generated methods in an abstract class should be tagged as abstract. This helps to remove their inapproprate 
usage by developers who should be implementing their own versions in the concrete subclasses.

Example(s):
```
public abstract class ShouldBeAbstract {
    public Object couldBeAbstract() {
        // Should be abstract method ?
        return null;
    }

    public void couldBeAbstract() {
    }
}
```
