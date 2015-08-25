//#Patterns: rulesets_java_migrating.xml_IntegerInstantiation
public class Foo {
    public void bar() {
        //#Warn: rulesets_java_migrating.xml_IntegerInstantiation
        new Integer("a");
    }
}

