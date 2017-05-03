Since: PMD 1.4

Object clone() should be implemented with super.clone().

Example(s):
```
class Foo{
    public Object clone(){
        return new Foo(); // This is bad
    }
}
```

[Source](https://pmd.github.io/pmd-5.6.1/pmd-java/rules/java/clone.html#ProperCloneImplementation)
