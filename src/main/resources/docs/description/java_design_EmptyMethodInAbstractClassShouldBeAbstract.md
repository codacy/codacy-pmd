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

[Source](https://pmd.github.io/pmd-5.5.4/pmd-java/rules/java/design.html#EmptyMethodInAbstractClassShouldBeAbstract)
