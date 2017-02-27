//#Patterns: java_strictexception_AvoidLosingExceptionInformation

public class Foo {
    public void bar() {
        try { // do something

        } catch (SomeException se) {
            //#Warn: java_strictexception_AvoidLosingExceptionInformation
            se.getMessage();
        }
    }
}

