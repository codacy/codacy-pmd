//#Patterns: category_java_errorprone_EmptyTryBlock

public class Foo {
    public void bar() {
        //#Warn: category_java_errorprone_EmptyTryBlock
        try {  } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
