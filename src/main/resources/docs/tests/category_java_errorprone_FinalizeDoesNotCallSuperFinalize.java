//#Patterns: category_java_errorprone_FinalizeDoesNotCallSuperFinalize

public class Foo {
    protected void finalize() {
      //#Warn: category_java_errorprone_FinalizeDoesNotCallSuperFinalize
      doSomething();
    }
}

public class Bar {
    protected void finalize() {
        super.finalize();
    }
}
