//#Patterns: rulesets_java_strings.xml_UseIndexOfChar
//#Err: rulesets_java_strings.xml_UseIndexOfChar
public class Foo {
    public void bar() {

String s = "hello world"; // avoid this if (s.indexOf("d") {} // instead do this if (s.indexOf('d') {}


    }
}

