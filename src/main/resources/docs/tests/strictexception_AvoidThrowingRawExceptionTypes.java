//#Patterns: strictexception_AvoidThrowingRawExceptionTypes

public class Foo {
    public void bar() throws Exception {
        //#Warn: strictexception_AvoidThrowingRawExceptionTypes
        throw new Exception();
    }
}