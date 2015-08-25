//#Patterns: rulesets_java_strings.xml_AvoidStringBufferField

public class Foo {

    //#Warn: rulesets_java_strings.xml_AvoidStringBufferField
    public StringBuffer output = new StringBuffer("");

    public void bar() {

    }

}