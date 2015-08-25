//#Patterns: rulesets_java_strings.xml_StringToString
public class Foo {

    private String baz() {
        //#Warn: rulesets_java_strings.xml_StringToString
        String bar = "howdy"; return bar.toString();
    }
}

