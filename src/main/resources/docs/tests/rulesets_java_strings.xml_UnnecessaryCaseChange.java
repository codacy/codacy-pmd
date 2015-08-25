//#Patterns: rulesets_java_strings.xml_UnnecessaryCaseChange

public class Foo {
    public void bar() {
//#Warn: rulesets_java_strings.xml_UnnecessaryCaseChange
boolean answer1 = buz.toUpperCase().equals("baz"); // should be buz.equalsIgnoreCase("baz") boolean answer2 = buz.toUpperCase().equalsIgnoreCase("baz"); // another unnecessary toUpperCase()


    }
}

