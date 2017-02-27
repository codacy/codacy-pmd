//#Patterns: java_clone_ProperCloneImplementation

public class Foo {

    //#Warn: java_clone_ProperCloneImplementation
    public Object clone() {
        return new Foo();
    }

    public Object clone() {
        return super.clone();
    }

}
