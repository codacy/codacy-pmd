//#Patterns: rulesets_java_strictexception.xml_AvoidThrowingNullPointerException

public class Foo {
    //#Warn: rulesets_java_strictexception.xml_AvoidThrowingNullPointerException
    void bar() { throw new NullPointerException(); }
}



