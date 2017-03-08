Since: PMD 3.4

Consider replacing Vector usages with the newer java.util.ArrayList if expensive thread-safe operations are not required.

Example(s):
```
public class Foo {
 void bar() {
    Vector v = new Vector();
 }
}
```

[Source](https://pmd.github.io/pmd-5.5.4/pmd-java/rules/java/migrating.html#ReplaceVectorWithList)
