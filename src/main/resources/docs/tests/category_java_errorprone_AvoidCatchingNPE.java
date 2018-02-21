//#Patterns: category_java_errorprone_AvoidCatchingNPE

public class Foo {
    void bar() {
        try { // do something
            //#Warn: category_java_errorprone_AvoidCatchingNPE
        } catch (NullPointerException npe) {

        }
    }
}
