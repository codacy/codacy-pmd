//#Patterns: category_java_errorprone_FinalizeOnlyCallsSuperFinalize

public class Foo {
    //#Warn: category_java_errorprone_FinalizeOnlyCallsSuperFinalize
    protected void finalize() {
        super.finalize();
    }
}
