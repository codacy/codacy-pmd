Since: PMD 3.1

Reports nested 'if' statements that can be merged together by joining their
conditions with a boolean `&amp;&amp;` operator in between.

Example(s):
```
class Foo {

    void bar() {
        if (x) {            // original implementation
            if (y) {
                // do stuff
            }
        }
    }

    void bar() {
        if (x && y) {        // clearer implementation
            // do stuff
        }
    }
}
```
