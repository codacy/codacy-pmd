Since: PMD 6.2.0

Enforce a policy for braces on control statements. It is recommended to use braces on 'if ... else'
            statements and loop statements, even if they are optional. This usually makes the code clearer, and
            helps prepare the future when you need to add another statement. That said, this rule lets you control
            which statements are required to have braces via properties.

            From 6.2.0 on, this rule supersedes WhileLoopMustUseBraces, ForLoopMustUseBraces, IfStmtMustUseBraces,
            and IfElseStmtMustUseBraces.

Example(s):
```
while (true)    // not recommended
  x++;

while (true) {  // preferred approach
  x++;
}
```
