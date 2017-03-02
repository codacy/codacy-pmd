//#Patterns: java_finalizers_FinalizeOnlyCallsSuperFinalize

public class Foo {
    protected void finalize() {
        //#Warn: java_finalizers_FinalizeOnlyCallsSuperFinalize
        super.finalize();
    }
}
