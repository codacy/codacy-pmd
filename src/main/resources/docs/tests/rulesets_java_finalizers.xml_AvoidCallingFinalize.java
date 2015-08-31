//#Patterns: finalizers_AvoidCallingFinalize

public class Foo {
    void bar() {
        Bar b = new Bar();
        //#Warn: finalizers_AvoidCallingFinalize
        b.finalize();
    }
}
