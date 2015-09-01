//#Patterns: strictexception_AvoidRethrowingException

public class Foo {
    public void bar() {
        try { // do something
        //#Warn: strictexception_AvoidRethrowingException
        } catch (SomeException se) {
            throw se;
        }
    }
}

