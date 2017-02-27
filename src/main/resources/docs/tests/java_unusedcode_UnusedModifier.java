//#Patterns: java_unusedcode_UnusedModifier
public interface Foo {
    //#Warn: java_unusedcode_UnusedModifier
    public abstract void bar(); 		// both abstract and public are ignored by the compiler
    //#Warn: java_unusedcode_UnusedModifier
    public static final int X = 0; 	    // public, static, and final all ignored
    //#Warn: java_unusedcode_UnusedModifier
    public static class Bar {} 		    // public, static ignored

    void foo();
}

public class Bar {
    //#Warn: java_unusedcode_UnusedModifier
    public static interface Baz {} // static ignored
}