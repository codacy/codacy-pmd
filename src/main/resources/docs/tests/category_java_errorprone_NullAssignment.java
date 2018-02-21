//#Patterns: category_java_errorprone_NullAssignment

public class Foo {
    
    public void bar() {
        Object x = null;

        x = new Object();

        //#Warn: category_java_errorprone_NullAssignment
        x = null;
    }
}
