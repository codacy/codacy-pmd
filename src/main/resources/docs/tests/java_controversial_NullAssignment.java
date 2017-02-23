//#Patterns: java_controversial_NullAssignment

public class Foo {
    
    public void bar() {
        Object x = null;

        x = new Object();

        //#Warn: java_controversial_NullAssignment
        x = null;
    }
}
