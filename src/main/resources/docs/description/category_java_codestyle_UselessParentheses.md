Since: PMD 5.0

Parenthesized expressions are used to override the default operator precedence
            rules. Parentheses whose removal would not change the relative nesting of operators
            are unnecessary, because they don't change the semantics of the enclosing expression.

            Some parentheses that strictly speaking are unnecessary, may still be considered useful
            for readability. This rule allows to ignore violations on two kinds of unnecessary parentheses:
            - &quot;Clarifying&quot; parentheses, which separate operators of difference precedence. While
            unnecessary, they make precedence rules explicit, which may be useful for rarely used
            operators. For example:
            ```java
                (a + b) &amp; c // is equivalent to `a + b &amp; c`, but probably clearer
            ```
            Unset the property `ignoreClarifying` to report them.

            - &quot;Balancing&quot; parentheses, which are unnecessary but visually balance out another pair
            of parentheses around an equality operator. For example, those two expressions are equivalent:
            ```java
                (a == null) != (b == null)
                a == null != (b == null)
            ```
            The parentheses on the right are required, and the parentheses on the left are
            just more visually pleasing. Unset the property `ignoreBalancing` to report them.

Example(s):
```
public class Foo {
    {
        int n = 0;
        n = (n);         // here
        n = (n * 2) * 3; // and here
        n = n * (2 * 3); // and here
    }
}
```
