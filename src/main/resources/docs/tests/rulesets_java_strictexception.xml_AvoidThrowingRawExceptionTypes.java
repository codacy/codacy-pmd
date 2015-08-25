//#Patterns: rulesets_java_strictexception.xml_AvoidThrowingRawExceptionTypes

public class Foo {
    public void bar() throws Exception {
        //#Warn: rulesets_java_strictexception.xml_AvoidThrowingRawExceptionTypes
        throw new Exception();
    }
}