//#Patterns: category_java_codestyle_WhileLoopsMustUseBraces
public class Foo {

    public void bar() {
        //#Warn: category_java_codestyle_WhileLoopsMustUseBraces
        while (true)	// not recommended
            x++;

        while (true) {	// preferred approach
            x++;
        }
    }

}
