//#Patterns: category_java_design_AvoidThrowingNullPointerException

public class Foo {
    //#Warn: category_java_design_AvoidThrowingNullPointerException
    void bar() { throw new NullPointerException(); }
}



