The overriding method merely calls the same method defined in a `superclass`.
There is a RunTime penalty for performing `2` method calls instead of one and therefore you should not do it.

Ex:

```
public void foo(String bar) {
	super.foo(bar); // why bother overriding?
}

public String foo() {
	return super.foo(); // why bother overriding?
}
```

[Source](http://pmd.sourceforge.net/pmd-5.3.2/pmd-java/rules/java/unnecessary.html#UselessOverridingMethod)
