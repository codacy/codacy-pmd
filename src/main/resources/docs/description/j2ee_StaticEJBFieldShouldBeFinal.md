According to the J2EE specification, an EJB should not have any static fields with write access. However, static read-only fields are allowed. This ensures proper behavior especially when instances are distributed by the container on several JREs.

Ex:

public class SomeEJB extends EJBObject implements EJBLocalHome {

	private static int CountA;			// poor, field can be edited

	private static final int CountB;	// preferred, read-only access
}

[SOURCE](https://pmd.github.io/pmd-5.3.3/pmd-java/rules/java/j2ee.html#StaticEJBFieldShouldBeFinal)
