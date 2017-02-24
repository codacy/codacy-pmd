//#Patterns: java_strictexception_AvoidCatchingNPE

public class Foo {
    void bar() {
        try { // do something
            //#Warn: java_strictexception_AvoidCatchingNPE
        } catch (NullPointerException npe) {

        }
    }
}