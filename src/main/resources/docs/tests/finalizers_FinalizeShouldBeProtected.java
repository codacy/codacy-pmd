//#Patterns: finalizers_FinalizeShouldBeProtected

public class Foo {
    //#Err: finalizers_FinalizeShouldBeProtected
    private void finalize() {  }
    //#Err: finalizers_FinalizeShouldBeProtected
    public void finalize() {  }

    protected void finalize() {  }
}
