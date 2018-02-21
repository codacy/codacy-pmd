//#Patterns: category_java_errorprone_FinalizeOverloaded

public class Foo {
    //#Warn: category_java_errorprone_FinalizeOverloaded
    protected void finalize(int a) {  }

    protected void finalize() {  }
}
