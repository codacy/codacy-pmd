Since: PMD 4.1

Java uses the 'short' type to reduce memory usage, not to optimize calculation. In fact, the JVM does not have any
arithmetic capabilities for the short type: the JVM must convert the short into an int, do the proper calculation
and convert the int back to a short. Thus any storage gains found through use of the 'short' type may be offset by
adverse impacts on performance.

Example(s):
```
public class UsingShort {
   private short doNotUseShort = 0;

   public UsingShort() {
    short shouldNotBeUsed = 1;
    doNotUseShort += shouldNotBeUsed;
  }
}
```

[Source](https://pmd.github.io/pmd-5.5.4/pmd-java/rules/java/controversial.html#AvoidUsingShortType)
