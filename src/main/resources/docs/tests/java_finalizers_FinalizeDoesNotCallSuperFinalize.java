//#Patterns: java_finalizers_FinalizeDoesNotCallSuperFinalize

public class Foo {
    protected void finalize() {
      //#Warn: java_finalizers_FinalizeDoesNotCallSuperFinalize
      doSomething();
    }
}

public class Bar {
    protected void finalize() {
        super.finalize();
    }
}
