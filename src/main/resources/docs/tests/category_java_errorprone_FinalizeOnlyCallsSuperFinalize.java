//#Patterns: category_java_errorprone_FinalizeOnlyCallsSuperFinalize

public class Foo {
    protected void finalize() {
        //#Warn: category_java_errorprone_FinalizeOnlyCallsSuperFinalize
        super.finalize();
    }
}
