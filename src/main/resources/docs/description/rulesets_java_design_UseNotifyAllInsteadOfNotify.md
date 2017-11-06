Since: PMD 3.0

Thread.notify() awakens a thread monitoring the object. If more than one thread is monitoring, then only
one is chosen.  The thread chosen is arbitrary; thus its usually safer to call notifyAll() instead.

Example(s):
```
void bar() {
    x.notify();
    // If many threads are monitoring x, only one (and you won't know which) will be notified.
    // use instead:
    x.notifyAll();
  }
```
