//#Patterns: java_strictexception_AvoidThrowingNewInstanceOfSameException

public class Foo {
    public void bar() {
        try { // do something
//#Warn: java_strictexception_AvoidThrowingNewInstanceOfSameException
        } catch (SomeException se) {
        // harmless comment
            throw new SomeException(se);
        }
    }
}

