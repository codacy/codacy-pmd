//#Patterns: logging-java_AvoidPrintStackTrace

class Foo {
    void bar() {
        try {
            // do something
        } catch (Exception e) {
            //#Warn: logging-java_AvoidPrintStackTrace
            e.printStackTrace();
        }
    }
}