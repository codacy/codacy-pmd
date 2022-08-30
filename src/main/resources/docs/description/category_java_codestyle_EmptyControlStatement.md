Since: PMD 6.46.0

Reports control statements whose body is empty, as well as empty initializers.

            The checked code constructs are the following:
            - bodies of `try` statements
            - `finally` clauses of `try` statements
            - `switch` statements
            - `synchronized` statements
            - `if` statements
            - loop statements: `while`, `for`, `do .. while`
            - initializers
            - blocks used as statements (for scoping)

            This rule replaces the rules EmptyFinallyBlock, 
            EmptyIfStmt, EmptyInitializer, EmptyStatementBlock, 
            EmptySwitchStatements, EmptySynchronizedBlock, EmptyTryBlock, and EmptyWhileStmt.

            Notice that {% rule java/errorprone/EmptyCatchBlock %} is still an independent rule.

            EmptyStatementNotInLoop is replaced by {% rule java/codestyle/UnnecessarySemicolon %}.

Example(s):
```
class Foo {
    {
        if (true); // empty if statement
        if (true) { // empty as well
        }
    }

    {} // empty initializer
}
```
