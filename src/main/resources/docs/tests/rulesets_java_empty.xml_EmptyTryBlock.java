//#Patterns: empty_EmptyTryBlock

public class Foo {
    public void bar() {
        //#Warn: empty_EmptyTryBlock
        try {  } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
