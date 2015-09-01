//#Patterns: finalizers_FinalizeOnlyCallsSuperFinalize

public class Foo {
    protected void finalize() {
        //#Warn: finalizers_FinalizeOnlyCallsSuperFinalize
        super.finalize();
    }
}
