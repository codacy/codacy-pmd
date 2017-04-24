Since: PMD 3.4

Uncommented Empty Method Body finds instances where a method body does not contain
statements, but there is no comment. By explicitly commenting empty method bodies
it is easier to distinguish between intentional (commented) and unintentional
empty methods.

Example(s):
```
public void doSomething() {
}
```
