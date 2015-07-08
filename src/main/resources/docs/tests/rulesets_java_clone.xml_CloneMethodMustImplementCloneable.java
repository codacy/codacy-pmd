//#Patterns: PMDJava_CloneMethodMustImplementCloneable

public class Foo {

    //#Err: PMDJava_CloneMethodMustImplementCloneable
    public Object clone() {
        return foo;
    }

    //#Err: PMDJava_CloneMethodMustImplementCloneable
    public Object clone() throws CloneNotSupportedException {
        return bar;
    }
}
