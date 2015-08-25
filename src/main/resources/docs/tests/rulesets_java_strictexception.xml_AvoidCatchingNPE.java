//#Patterns: rulesets_java_strictexception.xml_AvoidCatchingNPE

public class Foo {
    void bar() {
        try { // do something
            //#Warn: rulesets_java_strictexception.xml_AvoidCatchingNPE
        } catch (NullPointerException npe) {

        }
    }
}