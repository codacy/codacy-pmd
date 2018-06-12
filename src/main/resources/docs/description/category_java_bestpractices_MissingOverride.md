Since: PMD 6.2.0

Annotating overridden methods with @Override ensures at compile time that
            the method really overrides one, which helps refactoring and clarifies intent.

Example(s):
```
public class Foo implements Runnable {
                // This method is overridden, and should have an @Override annotation
                public void run() {

                }
            }
```
