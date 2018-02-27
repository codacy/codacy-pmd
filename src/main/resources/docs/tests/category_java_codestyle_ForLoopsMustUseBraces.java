//#Patterns: category_java_codestyle_ForLoopsMustUseBraces
public class Foo {

    public void bar() {
        //#Info: category_java_codestyle_ForLoopsMustUseBraces
        for (int i = 0; i < 42; i++)
            foo();


        for (int i = 0; i < 42; i++) {
            foo();
        }
    }

}
