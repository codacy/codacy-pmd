//#Patterns: category_java_errorprone_MethodWithSameNameAsEnclosingClass
public class Foo {
    public Foo() { // this is OK because it is a constructor
    }

    //#Warn: category_java_errorprone_MethodWithSameNameAsEnclosingClass
    public void Foo() { // this is bad because it is a methods
    }
}
