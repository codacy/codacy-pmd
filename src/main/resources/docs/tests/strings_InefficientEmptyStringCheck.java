//#Patterns: strings_InefficientEmptyStringCheck

public class Foo {
    void bar(String string) {
        //#Warn: strings_InefficientEmptyStringCheck
        if (string != null && string.trim().length() > 0) {
            doSomething();
        }
    }
}
