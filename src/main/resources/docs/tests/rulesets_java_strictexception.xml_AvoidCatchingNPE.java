//#Patterns: strictexception_AvoidCatchingNPE

public class Foo {
    void bar() {
        try { // do something
            //#Warn: strictexception_AvoidCatchingNPE
        } catch (NullPointerException npe) {

        }
    }
}