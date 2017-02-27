//#Patterns: java_empty_EmptyCatchBlock

public class Foo {
    public void bar() {
        try {
            FileInputStream fis = new FileInputStream("/some/directory");
        } 
        //#Info: java_empty_EmptyCatchBlock
        catch (IOException ioe) {  }
    }
}
