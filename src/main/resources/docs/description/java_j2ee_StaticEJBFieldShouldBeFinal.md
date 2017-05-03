Since: PMD 4.1

According to the J2EE specification, an EJB should not have any static fields
with write access. However, static read-only fields are allowed. This ensures proper
behavior especially when instances are distributed by the container on several JREs.

Example(s):
```
public class SomeEJB extends EJBObject implements EJBLocalHome {

	private static int CountA;			// poor, field can be edited

	private static final int CountB;	// preferred, read-only access
}
```

[Source](https://pmd.github.io/pmd-5.6.1/pmd-java/rules/java/j2ee.html#StaticEJBFieldShouldBeFinal)
