Since: PMD 3.3

Avoid the creation of unnecessary local variables

Example(s):
```
public class Foo {
   public int foo() {
     int x = doSomething();
     return x;  // instead, just 'return doSomething();'
   }
}
```

[Source](https://pmd.github.io/pmd-5.5.4/pmd-java/rules/java/design.html#UnnecessaryLocalBeforeReturn)
