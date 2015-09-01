//#Patterns: unnecessary_UselessOverridingMethod

public class Foo {
    
    //#Warn: unnecessary_UselessOverridingMethod
    public String foo() {
        return super.foo();
    }
}
