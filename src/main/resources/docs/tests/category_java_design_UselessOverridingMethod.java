//#Patterns: category_java_design_UselessOverridingMethod

public class Foo {
    
    //#Warn: category_java_design_UselessOverridingMethod
    public String foo() {
        return super.foo();
    }
}
