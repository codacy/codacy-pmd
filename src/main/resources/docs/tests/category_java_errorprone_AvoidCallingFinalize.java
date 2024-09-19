//#Patterns: category_java_errorprone_AvoidCallingFinalize

public class Foo {
    void bar() {
        Bar b = new Bar();
        //#Warn: category_java_errorprone_AvoidCallingFinalize
        b.finalize();
    }
}
