//#Patterns: strictexception_AvoidLosingExceptionInformation

public class Foo {
    public void bar() {
        try { // do something

        } catch (SomeException se) {
            //#Warn: strictexception_AvoidLosingExceptionInformation
            se.getMessage();
        }
    }
}

