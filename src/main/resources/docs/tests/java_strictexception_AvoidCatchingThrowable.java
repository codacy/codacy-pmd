//#Patterns: java_strictexception_AvoidCatchingThrowable

public class Foo {

    public void bar() {
        try { // do something
        //#Warn: java_strictexception_AvoidCatchingThrowable
        } catch (Throwable th) {
        // should not catch Throwable
            th.printStackTrace();
        }
    }
}