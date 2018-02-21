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
