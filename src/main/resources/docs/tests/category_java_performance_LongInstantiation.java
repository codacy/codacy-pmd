//#Patterns: category_java_performance_LongInstantiation
public class Foo {
    //#Warn: category_java_performance_LongInstantiation
    private Long i = new Long(0);
    // change to Long i = Long.valueOf(0);

}
