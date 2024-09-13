//#Patterns: category_java_design_AvoidThrowingNewInstanceOfSameException

public class Foo {
    public void bar() {
        try { // do something
        
        } catch (SomeException se) {
        // harmless comment
        //#Warn: category_java_design_AvoidThrowingNewInstanceOfSameException
            throw new SomeException(se);
        }
    }
}

