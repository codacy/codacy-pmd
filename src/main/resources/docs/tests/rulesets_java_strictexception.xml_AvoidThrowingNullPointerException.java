//#Patterns: strictexception_AvoidThrowingNullPointerException

public class Foo {
    //#Warn: strictexception_AvoidThrowingNullPointerException
    void bar() { throw new NullPointerException(); }
}



