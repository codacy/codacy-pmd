//#Patterns: rulesets_java_strings.xml_StringBufferInstantiationWithChar
public class Foo {
    public void bar() {
        //#Warn: rulesets_java_strings.xml_StringBufferInstantiationWithChar
        StringBuffer output = new StringBuffer('a');
    }
}

