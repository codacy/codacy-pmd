//#Patterns: category_java_performance_InefficientEmptyStringCheck

public class Foo {
    void bar(String string) {
        //#Warn: category_java_performance_InefficientEmptyStringCheck
        if (string != null && string.trim().length() == 0) {
            doSomething();
        }
    }
}
