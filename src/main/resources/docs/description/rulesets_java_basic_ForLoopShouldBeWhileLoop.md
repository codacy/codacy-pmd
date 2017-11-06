Since: PMD 1.02

Some for loops can be simplified to while loops, this makes them more concise.

Example(s):
```
public class Foo {
    void bar() {
        for (;true;) true; // No Init or Update part, may as well be: while (true)
    }
}
```
