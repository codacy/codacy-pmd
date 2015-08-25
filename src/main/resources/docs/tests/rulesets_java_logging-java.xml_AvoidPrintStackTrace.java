//#Patterns: rulesets_java_logging-java.xml_AvoidPrintStackTrace

class Foo {
    void bar() {
        try {
            // do something
        } catch (Exception e) {
            //#Warn: rulesets_java_logging-java.xml_AvoidPrintStackTrace
            e.printStackTrace();
        }
    }
}