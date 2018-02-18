//#Patterns: category_java_performance_ShortInstantiation

public class Foo {
    //#Warn: category_java_performance_ShortInstantiation
    private Short i = new Short(0);
    // change to Short i = Short.valueOf(0);
}
