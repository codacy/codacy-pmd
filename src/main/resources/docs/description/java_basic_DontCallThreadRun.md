Since: PMD 4.3

Explicitly calling Thread.run() method will execute in the caller's thread of control.  Instead, call Thread.start() for the intended behavior.

Example(s):
```
Thread t = new Thread();
t.run();            // use t.start() instead
new Thread().run(); // same violation
```

[Source](https://pmd.github.io/pmd-5.6.1/pmd-java/rules/java/basic.html#DontCallThreadRun)
