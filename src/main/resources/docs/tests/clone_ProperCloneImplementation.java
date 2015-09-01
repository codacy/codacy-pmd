//#Patterns: clone_ProperCloneImplementation

public class Foo {

    //#Err: clone_ProperCloneImplementation
    public Object clone() {
        return new Foo();
    }

    public Object clone() {
        return super.clone();
    }

}
