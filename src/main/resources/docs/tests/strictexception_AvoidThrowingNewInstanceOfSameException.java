//#Patterns: strictexception_AvoidThrowingNewInstanceOfSameException

public class Foo {
    public void bar() {
        try { // do something
//#Warn: strictexception_AvoidThrowingNewInstanceOfSameException
        } catch (SomeException se) {
        // harmless comment
            throw new SomeException(se);
        }
    }
}

