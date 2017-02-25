//#Patterns: java_braces_ForLoopsMustUseBraces
public class Foo {

    public void bar() {
        //#Info: java_braces_ForLoopsMustUseBraces
        for (int i = 0; i < 42; i++)
            foo();


        for (int i = 0; i < 42; i++) {
            foo();
        }
    }

}