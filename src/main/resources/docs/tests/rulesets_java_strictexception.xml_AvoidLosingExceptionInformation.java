//#Patterns: rulesets_java_strictexception.xml_AvoidLosingExceptionInformation

public class Foo {
    public void bar() {
        try { // do something

        } catch (SomeException se) {
            //#Warn: rulesets_java_strictexception.xml_AvoidLosingExceptionInformation
            se.getMessage();
        }
    }
}

