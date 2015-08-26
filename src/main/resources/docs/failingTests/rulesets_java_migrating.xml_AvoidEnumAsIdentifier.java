//#Patterns: rulesets_java_migrating.xml_AvoidEnumAsIdentifier

public class A {
    public class foo {
        //#Warn: rulesets_java_migrating.xml_AvoidEnumAsIdentifier
        String enum = "foo";
    }
}