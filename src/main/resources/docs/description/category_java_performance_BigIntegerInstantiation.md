Since: PMD 3.9

Don't create instances of already existing BigInteger (`BigInteger.ZERO`, `BigInteger.ONE`),
for Java 1.5 onwards, BigInteger.TEN and BigDecimal (`BigDecimal.ZERO`, `BigDecimal.ONE`, `BigDecimal.TEN`) and
for Java 9 onwards `BigInteger.TWO`.

Example(s):
```
BigInteger bi1 = new BigInteger("1");    // reference BigInteger.ONE instead
BigInteger bi2 = new BigInteger("0");    // reference BigInteger.ZERO instead
BigInteger bi3;
bi3 = new BigInteger("0");               // reference BigInteger.ZERO instead

BigDecimal bd1 = new BigDecimal(0);      // reference BigDecimal.ZERO instead
BigDecimal bd2 = new BigDecimal("0.") ;  // reference BigDecimal.ZERO instead
BigDecimal bd3 = new BigDecimal(10);     // reference BigDecimal.TEN instead
```
