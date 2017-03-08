Since: PMD 3.9

Integer literals should not start with zero since this denotes that the rest of literal will be
interpreted as an octal value.

Example(s):
```
int i = 012;	// set i with 10 not 12
int j = 010;	// set j with 8 not 10
k = i * j;		// set k with 80 not 120
```

[Source](https://pmd.github.io/pmd-5.5.4/pmd-java/rules/java/basic.html#AvoidUsingOctalValues)
