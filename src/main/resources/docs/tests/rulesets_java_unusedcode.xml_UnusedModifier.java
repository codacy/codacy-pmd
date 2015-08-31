//#Patterns: unusedcode_UnusedModifier
public interface Foo {
    //#Warn: unusedcode_UnusedModifier
    public abstract void bar(); 		// both abstract and public are ignored by the compiler
    //#Warn: unusedcode_UnusedModifier
    public static final int X = 0; 	    // public, static, and final all ignored
    //#Warn: unusedcode_UnusedModifier
    public static class Bar {} 		    // public, static ignored
    //#Warn: unusedcode_UnusedModifier
    public static interface Baz {} 	    // ditto

    void foo();
}

public class Bar {
    //#Warn: unusedcode_UnusedModifier
    public static interface Baz {} // static ignored
}