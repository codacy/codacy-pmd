//#Patterns: rulesets_java_migrating.xml_AvoidAssertAsIdentifier

public class A {
    public class foo {
        //#Warn: rulesets_java_migrating.xml_AvoidAssertAsIdentifier
        String assert = "foo";
    }
}