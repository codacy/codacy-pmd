Since: PMD 6.36.0

Reports comparisons with double and float `NaN` (Not-a-Number) values.
            These are [specified](https://docs.oracle.com/javase/specs/jls/se8/html/jls-15.html#jls-15.21.1)
            to have unintuitive behavior: NaN is considered unequal to itself.
            This means a check like `someDouble == Double.NaN` will always return
            false, even if `someDouble` is really the NaN value. To test whether a
            value is the NaN value, one should instead use `Double.isNaN(someDouble)`
            (or `Float.isNaN`). The `!=` operator should be treated similarly.
            Finally, comparisons like `someDouble &lt;= Double.NaN` are nonsensical
            and will always evaluate to false.
            
            This rule has been renamed from &quot;BadComparison&quot; with PMD 6.36.0.

Example(s):
```
boolean x = (y == Double.NaN);
```
