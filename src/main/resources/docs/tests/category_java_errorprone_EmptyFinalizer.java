//#Patterns: category_java_errorprone_EmptyFinalizer

public class Foo {
    //#Warn: category_java_errorprone_EmptyFinalizer
    protected void finalize() {  }
}
