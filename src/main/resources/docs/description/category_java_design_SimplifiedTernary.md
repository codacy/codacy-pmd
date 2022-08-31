Since: PMD 5.4.0

Look for ternary operators with the form `condition ? literalBoolean : foo`
or `condition ? foo : literalBoolean`.

These expressions can be simplified as follows:
* `condition ? true : expr` simplifies to `condition || expr`
* `condition ? false : expr` simplifies to `!condition &amp;&amp; expr`
* `condition ? expr : true` simplifies to `!condition || expr`
* `condition ? expr : false` simplifies to `condition &amp;&amp; expr`

Example(s):
```
public class Foo {
    public boolean test() {
        return condition ? true : something(); // can be as simple as return condition || something();
    }

    public void test2() {
        final boolean value = condition ? false : something(); // can be as simple as value = !condition && something();
    }

    public boolean test3() {
        return condition ? something() : true; // can be as simple as return !condition || something();
    }

    public void test4() {
        final boolean otherValue = condition ? something() : false; // can be as simple as condition && something();
    }

    public boolean test5() {
        return condition ? true : false; // can be as simple as return condition;
    }
}
```
