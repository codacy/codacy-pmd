//#Patterns: category_java_multithreading_AvoidUsingVolatile

public class Foo {
    //#Warn: category_java_multithreading_AvoidUsingVolatile
    private volatile String var1;

    private String var2;
}
