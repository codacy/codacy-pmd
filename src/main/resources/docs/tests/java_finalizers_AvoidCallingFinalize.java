//#Patterns: java_finalizers_AvoidCallingFinalize

public class Foo {
    void bar() {
        Bar b = new Bar();
        //#Warn: java_finalizers_AvoidCallingFinalize
        b.finalize();
    }
}
