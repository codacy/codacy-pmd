//#Patterns: category_java_codestyle_ForLoopsMustUseBraces
public class Foo {

    public void bar() {
        //#Warn: category_java_codestyle_ForLoopsMustUseBraces
        for (int i = 0; i < 42; i++)
            foo();


        for (int i = 0; i < 42; i++) {
            foo();
        }
    }

}
