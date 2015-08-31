//#Patterns: empty_EmptyCatchBlock

public class Foo {
    public void bar() {
        try {
            FileInputStream fis = new FileInputStream("/some/directory");
        } 
        //#Warn: empty_EmptyCatchBlock
        catch (IOException ioe) {  }
    }
}
