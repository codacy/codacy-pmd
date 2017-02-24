//#Patterns: java_empty_EmptyFinallyBlock

public class Foo {
    public void bar() {
        try {
            int x = 2;
        } 
        //#Info: java_empty_EmptyFinallyBlock
        finally {
            //empty!
        }
    }
}
