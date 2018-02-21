//#Patterns: category_java_design_AvoidThrowingNewInstanceOfSameException

public class Foo {
    public void bar() {
        try { // do something
//#Warn: category_java_design_AvoidThrowingNewInstanceOfSameException
        } catch (SomeException se) {
        // harmless comment
            throw new SomeException(se);
        }
    }
}

