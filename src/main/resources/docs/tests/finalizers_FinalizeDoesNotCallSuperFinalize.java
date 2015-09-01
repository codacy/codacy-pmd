//#Patterns: finalizers_FinalizeDoesNotCallSuperFinalize

public class Foo {
    protected void finalize() {
      //#Err: finalizers_FinalizeDoesNotCallSuperFinalize
      doSomething();
    }
}

public class Bar {
    protected void finalize() {
        super.finalize();
    }
}
