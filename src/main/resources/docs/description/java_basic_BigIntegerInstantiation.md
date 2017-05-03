Since: PMD 3.9

Don't create instances of already existing BigInteger (BigInteger.ZERO, BigInteger.ONE) and
for Java 1.5 onwards, BigInteger.TEN and BigDecimal (BigDecimal.ZERO, BigDecimal.ONE, BigDecimal.TEN)

Example(s):
```
BigInteger bi = new BigInteger(1);		// reference BigInteger.ONE instead
BigInteger bi2 = new BigInteger("0");	// reference BigInteger.ZERO instead
BigInteger bi3 = new BigInteger(0.0);	// reference BigInteger.ZERO instead
BigInteger bi4;
bi4 = new BigInteger(0);				// reference BigInteger.ZERO instead
```

[Source](https://pmd.github.io/pmd-5.6.1/pmd-java/rules/java/basic.html#BigIntegerInstantiation)
