Since: PMD 3.4

Consider replacing Hashtable usage with the newer java.util.Map if thread safety is not required.

Example(s):
```
public class Foo {
    void bar() {
        Hashtable h = new Hashtable();
    }
}
```
