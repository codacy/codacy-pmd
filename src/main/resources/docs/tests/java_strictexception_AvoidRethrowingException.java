//#Patterns: java_strictexception_AvoidRethrowingException

public class Foo {
    public void bar() {
        try { // do something
        //#Warn: java_strictexception_AvoidRethrowingException
        } catch (SomeException se) {
            throw se;
        }
    }
}

