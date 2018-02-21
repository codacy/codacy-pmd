//#Patterns: category_java_errorprone_EmptyFinallyBlock

public class Foo {
    public void bar() {
        try {
            int x = 2;
        } 
        //#Warn: category_java_errorprone_EmptyFinallyBlock
        finally {
            //empty!
        }
    }
}
