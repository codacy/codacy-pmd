Since: PMD 5.5.3

Detects the usage of untrusted / unescaped variables in DML queries.

Example(s):
```
public class Foo {
    public void test1(String t1) {
        Database.query('SELECT Id FROM Account' + t1);
    }
}
```

[Source](https://pmd.github.io/pmd-5.5.4/pmd-apex/rules/apex/security.html#ApexSOQLInjection)
