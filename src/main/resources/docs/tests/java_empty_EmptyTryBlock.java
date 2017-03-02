//#Patterns: java_empty_EmptyTryBlock

public class Foo {
    public void bar() {
        //#Info: java_empty_EmptyTryBlock
        try {  } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
