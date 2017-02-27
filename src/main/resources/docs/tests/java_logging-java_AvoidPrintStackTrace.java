//#Patterns: java_logging-java_AvoidPrintStackTrace

class Foo {
    void bar() {
        try {
            // do something
        } catch (Exception e) {
            //#Info: java_logging-java_AvoidPrintStackTrace
            e.printStackTrace();
        }
    }
}