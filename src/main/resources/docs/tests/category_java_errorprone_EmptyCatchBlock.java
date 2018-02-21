//#Patterns: category_java_errorprone_EmptyCatchBlock

public class Foo {
    public void bar() {
        try {
            FileInputStream fis = new FileInputStream("/some/directory");
        } 
        //#Warn: category_java_errorprone_EmptyCatchBlock
        catch (IOException ioe) {  }
    }
}
