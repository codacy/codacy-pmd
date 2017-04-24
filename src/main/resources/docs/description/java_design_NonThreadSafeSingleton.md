Since: PMD 3.4

Non-thread safe singletons can result in bad state changes. Eliminate
static singletons if possible by instantiating the object directly. Static
singletons are usually not needed as only a single instance exists anyway.
Other possible fixes are to synchronize the entire method or to use an
[initialize-on-demand holder class](https://en.wikipedia.org/wiki/Initialization-on-demand_holder_idiom).

Refrain from using the double-checked locking pattern. The Java Memory Model doesn't
guarantee it to work unless the variable is declared as `volatile`, adding an uneeded
performance penalty. [Reference](http://www.cs.umd.edu/~pugh/java/memoryModel/DoubleCheckedLocking.html)

See Effective Java, item 48.

Example(s):
```
private static Foo foo = null;

//multiple simultaneous callers may see partially initialized objects
public static Foo getFoo() {
    if (foo==null) {
        foo = new Foo();
    }
    return foo;
}
```
