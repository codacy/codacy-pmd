//#Patterns: java_strictexception_AvoidThrowingNullPointerException

public class Foo {
    //#Warn: java_strictexception_AvoidThrowingNullPointerException
    void bar() { throw new NullPointerException(); }
}



