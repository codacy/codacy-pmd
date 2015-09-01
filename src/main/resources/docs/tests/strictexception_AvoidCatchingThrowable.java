//#Patterns: strictexception_AvoidCatchingThrowable

public class Foo {

    public void bar() {
        try { // do something
        //#Warn: strictexception_AvoidCatchingThrowable
        } catch (Throwable th) {
        // should not catch Throwable
            th.printStackTrace();
        }
    }
}