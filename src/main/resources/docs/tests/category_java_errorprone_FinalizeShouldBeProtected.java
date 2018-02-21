//#Patterns: category_java_errorprone_FinalizeShouldBeProtected

public class Foo {
    //#Warn: category_java_errorprone_FinalizeShouldBeProtected
    private void finalize() {  }
    //#Warn: category_java_errorprone_FinalizeShouldBeProtected
    public void finalize() {  }

    protected void finalize() {  }
}
