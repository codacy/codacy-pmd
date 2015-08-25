//#Patterns: rulesets_java_strings.xml_UseIndexOfChar

public class Foo {

    public void bar() {

        String s = "hello world";

        // avoid this
        //#Warn: rulesets_java_strings.xml_UseIndexOfChar
        if (s.indexOf("d") == 1) {

        }

        // instead do this
        if (s.indexOf('d') == 1) {

        }
    }
}

