//#Patterns: category_java_errorprone_StaticEJBFieldShouldBeFinal

//#Warn: category_java_errorprone_StaticEJBFieldShouldBeFinal
public class SomeEJB extends EJBObject implements EJBLocalHome {
    private static int CountA;
    // poor, field can be edited

    private static final int CountB; // preferred, read-only access

}
