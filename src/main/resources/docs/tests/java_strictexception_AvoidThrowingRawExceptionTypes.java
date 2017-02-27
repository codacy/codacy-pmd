//#Patterns: java_strictexception_AvoidThrowingRawExceptionTypes

public class Foo {
    public void bar() throws Exception {
        //#Warn: java_strictexception_AvoidThrowingRawExceptionTypes
        throw new Exception();
    }
}