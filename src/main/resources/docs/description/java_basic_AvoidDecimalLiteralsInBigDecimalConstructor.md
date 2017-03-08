Since: PMD 3.4

One might assume that the result of &quot;new BigDecimal(0.1)&quot; is exactly equal to 0.1, but it is actually
equal to .1000000000000000055511151231257827021181583404541015625.
This is because 0.1 cannot be represented exactly as a double (or as a binary fraction of any finite
length). Thus, the long value that is being passed in to the constructor is not exactly equal to 0.1,
appearances notwithstanding.

The (String) constructor, on the other hand, is perfectly predictable: 'new BigDecimal(&quot;0.1&quot;)' is
exactly equal to 0.1, as one would expect.  Therefore, it is generally recommended that the
(String) constructor be used in preference to this one.

Example(s):
```
BigDecimal bd = new BigDecimal(1.123);		// loss of precision, this would trigger the rule

BigDecimal bd = new BigDecimal("1.123");   	// preferred approach

BigDecimal bd = new BigDecimal(12);     	// preferred approach, ok for integer values
```

[Source](https://pmd.github.io/pmd-5.5.4/pmd-java/rules/java/basic.html#AvoidDecimalLiteralsInBigDecimalConstructor)
