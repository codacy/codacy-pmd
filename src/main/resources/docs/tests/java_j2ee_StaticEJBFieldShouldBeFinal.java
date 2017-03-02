//#Patterns: java_j2ee_StaticEJBFieldShouldBeFinal

//#Warn: java_j2ee_StaticEJBFieldShouldBeFinal
public class SomeEJB extends EJBObject implements EJBLocalHome {
    private static int CountA;
    // poor, field can be edited

    private static final int CountB; // preferred, read-only access

}