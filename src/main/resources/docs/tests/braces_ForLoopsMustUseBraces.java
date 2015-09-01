//#Patterns: braces_ForLoopsMustUseBraces
public class Foo {

    public void bar() {
        //#Info: braces_ForLoopsMustUseBraces
        for (int i = 0; i < 42; i++)
            foo();


        for (int i = 0; i < 42; i++) {
            foo();
        }
    }

}