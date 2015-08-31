//#Patterns: controversial_NullAssignment

public class Foo {
    
    public void bar() {
        Object x = null;

        x = new Object();

        //#Warn: controversial_NullAssignment
        x = null;
    }
}
