//#Patterns: java_unnecessary_UselessOverridingMethod

public class Foo {
    
    //#Warn: java_unnecessary_UselessOverridingMethod
    public String foo() {
        return super.foo();
    }
}
