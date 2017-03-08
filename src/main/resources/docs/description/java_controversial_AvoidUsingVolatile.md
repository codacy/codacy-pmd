Since: PMD 4.1

Use of the keyword 'volatile' is generally used to fine tune a Java application, and therefore, requires
a good expertise of the Java Memory Model. Moreover, its range of action is somewhat misknown. Therefore,
the volatile keyword should not be used for maintenance purpose and portability.

Example(s):
```
public class ThrDeux {
  private volatile String var1;	// not suggested
  private          String var2;	// preferred
}
```

[Source](https://pmd.github.io/pmd-5.5.4/pmd-java/rules/java/controversial.html#AvoidUsingVolatile)
