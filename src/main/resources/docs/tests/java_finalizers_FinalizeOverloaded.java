//#Patterns: java_finalizers_FinalizeOverloaded

public class Foo {
    //#Warn: java_finalizers_FinalizeOverloaded
    protected void finalize(int a) {  }

    protected void finalize() {  }
}
