//#Patterns: category_java_errorprone_AvoidCatchingThrowable

public class Foo {

    public void bar() {
        try { // do something
        //#Warn: category_java_errorprone_AvoidCatchingThrowable
        } catch (Throwable th) {
        // should not catch Throwable
            th.printStackTrace();
        }
    }
}
