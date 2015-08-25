//#Patterns: rulesets_java_strings.xml_AvoidDuplicateLiterals
public class Foo {

    private void bar() {
        //#Warn: rulesets_java_strings.xml_AvoidDuplicateLiterals
            buz("Howdy");
            buz("Howdy");
            buz("Howdy");
            buz("Howdy");
        }

    private void buz(String x) {

    }


}

