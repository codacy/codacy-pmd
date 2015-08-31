//#Patterns: finalizers_EmptyFinalizer

public class Foo {
    //#Warn: finalizers_EmptyFinalizer
    protected void finalize() {  }
}
