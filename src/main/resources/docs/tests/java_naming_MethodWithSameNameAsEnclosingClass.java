//#Patterns: java_naming_MethodWithSameNameAsEnclosingClass
public class Foo {
    public Foo() { // this is OK because it is a constructor
    }

    //#Info: java_naming_MethodWithSameNameAsEnclosingClass
    public void Foo() { // this is bad because it is a methods
    }
}