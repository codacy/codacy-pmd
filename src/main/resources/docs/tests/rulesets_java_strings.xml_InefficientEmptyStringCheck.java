//#Patterns: rulesets_java_strings.xml_InefficientEmptyStringCheck

public class Foo {
    void bar(String string) {
        //#Warn: rulesets_java_strings.xml_InefficientEmptyStringCheck
        if (string != null && string.trim().length() > 0) {
            doSomething();
        }
    }
}
