//#Patterns: category_java_errorprone_AvoidLosingExceptionInformation

public class Foo {
    public void bar() {
        try { // do something

        } catch (SomeException se) {
            //#Warn: category_java_errorprone_AvoidLosingExceptionInformation
            se.getMessage();
        }
    }
}

