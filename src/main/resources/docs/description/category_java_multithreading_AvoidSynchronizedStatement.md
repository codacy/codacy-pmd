Since: PMD 7.5.0

Synchronization will pin virtual threads and can cause performance problems.

Example(s):
```
public class Foo {
    // Try to avoid this:
    void foo() {
        // code that doesn't need mutual exclusion
        synchronized(this) {
            // code that requires mutual exclusion
        }
        // more code that doesn't need mutual exclusion
    }
    // Prefer this:
    Lock instanceLock = new ReentrantLock();

    void foo() {
        // code that doesn't need mutual exclusion
        try {
            instanceLock.lock();  // or instanceLock.tryLock(long time, TimeUnit unit)
            // code that requires mutual exclusion
        } finally {
            instanceLock.unlock();
        }
        // more code that doesn't need mutual exclusion
    }
}
```
