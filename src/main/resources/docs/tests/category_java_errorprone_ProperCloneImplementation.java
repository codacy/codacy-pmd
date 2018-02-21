//#Patterns: category_java_errorprone_ProperCloneImplementation

public class Foo {

    //#Warn: category_java_errorprone_ProperCloneImplementation
    public Object clone() {
        return new Foo();
    }

    public Object clone() {
        return super.clone();
    }

}
