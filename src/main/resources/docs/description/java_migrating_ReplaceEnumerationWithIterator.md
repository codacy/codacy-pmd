Since: PMD 3.4

Consider replacing Enumeration usages with the newer java.util.Iterator

Example(s):
```
public class Foo implements Enumeration {
    private int x = 42;
    public boolean hasMoreElements() {
        return true;
    }
    public Object nextElement() {
        return String.valueOf(i++);
    }
}
```

[Source](https://pmd.github.io/pmd-5.5.4/pmd-java/rules/java/migrating.html#ReplaceEnumerationWithIterator)
