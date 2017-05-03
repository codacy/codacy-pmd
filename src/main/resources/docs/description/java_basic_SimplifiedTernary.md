Since: PMD 5.4.0

Look for ternary operators with the form `condition ? literalBoolean : foo`
or `condition ? foo : literalBoolean`.

These expressions can be simplified respectively to
`condition || foo`  when the literalBoolean is true
`!condition &amp;&amp; foo` when the literalBoolean is false
or
`!condition || foo` when the literalBoolean is true
`condition &amp;&amp; foo`  when the literalBoolean is false

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
}
```

[Source](https://pmd.github.io/pmd-5.6.1/pmd-java/rules/java/basic.html#SimplifiedTernary)
