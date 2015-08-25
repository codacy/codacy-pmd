//#Patterns: rulesets_java_strictexception.xml_AvoidRethrowingException

public class Foo {
    public void bar() {
        try { // do something
        //#Warn: rulesets_java_strictexception.xml_AvoidRethrowingException
        } catch (SomeException se) {
            throw se;
        }
    }
}

