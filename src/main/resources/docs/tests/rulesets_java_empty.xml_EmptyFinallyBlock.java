//#Patterns: empty_EmptyFinallyBlock

public class Foo {
    public void bar() {
        try {
            int x = 2;
        } 
        //#Warn: empty_EmptyFinallyBlock
        finally {
            //empty!
        }
    }
}
