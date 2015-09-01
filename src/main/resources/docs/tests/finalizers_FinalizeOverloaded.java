//#Patterns: finalizers_FinalizeOverloaded

public class Foo {
    //#Err: finalizers_FinalizeOverloaded
    protected void finalize(int a) {  }

    protected void finalize() {  }
}
