Since: PMD 3.6

SimpleDateFormat instances are not synchronized. Sun recommends using separate format instances
for each thread. If multiple threads must access a static formatter, the formatter must be 
synchronized either on method or block level.

Example(s):
```
public class Foo {
    private static final SimpleDateFormat sdf = new SimpleDateFormat();
    void bar() {
        sdf.format(); // poor, no thread-safety
    }
    synchronized void foo() {
        sdf.format(); // preferred
    }
}
```

[Source](https://pmd.github.io/pmd-5.6.1/pmd-java/rules/java/design.html#UnsynchronizedStaticDateFormatter)
