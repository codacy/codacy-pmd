Since: PMD 3.0

Method-level synchronization can cause problems when new code is added to the method.
Block-level synchronization helps to ensure that only the code that needs synchronization
gets it.

Example(s):
```
public class Foo {
    // Try to avoid this:
    synchronized void foo() {
        // code, that doesn't need synchronization
        // ...
        // code, that requires synchronization
        if (!sharedData.has("bar")) {
            sharedData.add("bar");
        }
        // more code, that doesn't need synchronization
        // ...
    }
    // Prefer this:
    void bar() {
        // code, that doesn't need synchronization
        // ...
        synchronized(this) {
            if (!sharedData.has("bar")) {
                sharedData.add("bar");
            }
        }
        // more code, that doesn't need synchronization
        // ...
    }

    // Try to avoid this for static methods:
    static synchronized void fooStatic() {
    }

    // Prefer this:
    static void barStatic() {
        // code, that doesn't need synchronization
        // ...
        synchronized(Foo.class) {
            // code, that requires synchronization
        }
        // more code, that doesn't need synchronization
        // ...
    }
}
```
