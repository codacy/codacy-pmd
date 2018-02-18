//#Patterns: category_java_design_AvoidThrowingRawExceptionTypes

public class Foo {
    public void bar() throws Exception {
        //#Warn: category_java_design_AvoidThrowingRawExceptionTypes
        throw new Exception();
    }
}
