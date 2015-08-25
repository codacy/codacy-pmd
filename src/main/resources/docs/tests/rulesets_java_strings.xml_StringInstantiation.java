//#Patterns: rulesets_java_strings.xml_StringInstantiation
public class Foo {

    public void bar() {
        //#Warn: rulesets_java_strings.xml_StringInstantiation
        String bar = new String("bar"); // just do a String bar = "bar";
    }
}

