Since: PMD 2.2

Constructors and methods receiving arrays should clone objects and store the copy.
This prevents future changes from the user from affecting the original array.

Example(s):
```
public class Foo {
  private String [] x;
    public void foo (String [] param) {
      // Don't do this, make a copy of the array at least
      this.x=param;
    }
}
```

[Source](https://pmd.github.io/pmd-5.6.1/pmd-java/rules/java/sunsecure.html#ArrayIsStoredDirectly)
