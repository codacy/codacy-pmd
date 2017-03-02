//#Patterns: java_finalizers_FinalizeShouldBeProtected

public class Foo {
    //#Warn: java_finalizers_FinalizeShouldBeProtected
    private void finalize() {  }
    //#Warn: java_finalizers_FinalizeShouldBeProtected
    public void finalize() {  }

    protected void finalize() {  }
}
