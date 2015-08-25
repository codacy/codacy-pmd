//#Patterns: rulesets_java_strictexception.xml_AvoidThrowingNewInstanceOfSameException

public class Foo {
    public void bar() {
        try { // do something
//#Warn: rulesets_java_strictexception.xml_AvoidThrowingNewInstanceOfSameException
        } catch (SomeException se) {
        // harmless comment
            throw new SomeException(se);
        }
    }
}

