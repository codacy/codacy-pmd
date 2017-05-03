Since: PMD 1.2

Avoid instantiating Boolean objects; you can reference Boolean.TRUE, Boolean.FALSE, or call Boolean.valueOf() instead.

Example(s):
```
Boolean bar = new Boolean("true");		// unnecessary creation, just reference Boolean.TRUE;
Boolean buz = Boolean.valueOf(false);	// ...., just reference Boolean.FALSE;
```

[Source](https://pmd.github.io/pmd-5.6.1/pmd-java/rules/java/basic.html#BooleanInstantiation)
