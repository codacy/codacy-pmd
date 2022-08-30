Since: PMD 6.46.0

Reports unnecessary semicolons (so called &quot;empty statements&quot; and &quot;empty declarations&quot;).
            These can be removed without changing the program. The Java grammar
            allows them for historical reasons, but they should be avoided.
            
            This rule will not report empty statements that are syntactically 
            required, for instance, because they are the body of a control statement.

            This rule replaces EmptyStatementNotInLoop.

Example(s):
```
class Foo {
    {
        toString();; // one of these semicolons is unnecessary
        if (true); // this semicolon is not unnecessary, but it could be an empty block instead (not reported)
    }
}; // this semicolon is unnecessary
```
