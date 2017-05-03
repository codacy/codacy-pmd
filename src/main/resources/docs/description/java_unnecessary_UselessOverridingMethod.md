Since: PMD 3.3

The overriding method merely calls the same method defined in a superclass.

Example(s):
```
public void foo(String bar) {
  super.foo(bar);      // why bother overriding?
}

public String foo() {
	return super.foo();  // why bother overriding?
}

@Id
public Long getId() {
  return super.getId();  // OK if 'ignoreAnnotations' is false, which is the default behavior
}
```

[Source](https://pmd.github.io/pmd-5.6.1/pmd-java/rules/java/unnecessary.html#UselessOverridingMethod)
