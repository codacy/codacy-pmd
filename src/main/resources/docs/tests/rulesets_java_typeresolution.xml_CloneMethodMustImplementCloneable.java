//#Patterns: typeresolution_CloneMethodMustImplementCloneable

public class Foo {

    //#Err: typeresolution_CloneMethodMustImplementCloneable
    public Object clone() {
        return foo;
    }

    //#Err: typeresolution_CloneMethodMustImplementCloneable
    public Object clone() throws CloneNotSupportedException {
        return bar;
    }

}
