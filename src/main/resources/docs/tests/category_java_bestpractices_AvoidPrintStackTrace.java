//#Patterns: category_java_bestpractices_AvoidPrintStackTrace

class Foo {
    void bar() {
        try {
            // do something
        } catch (Exception e) {
            //#Warn: category_java_bestpractices_AvoidPrintStackTrace
            e.printStackTrace();
        }
    }
}
