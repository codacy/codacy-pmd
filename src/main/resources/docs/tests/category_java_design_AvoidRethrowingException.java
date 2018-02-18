//#Patterns: category_java_design_AvoidRethrowingException

public class Foo {
    public void bar() {
        try { // do something
        //#Warn: category_java_design_AvoidRethrowingException
        } catch (SomeException se) {
            throw se;
        }
    }
}

