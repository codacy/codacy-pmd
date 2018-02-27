//#Patterns: category_java_codestyle_WhileLoopsMustUseBraces
public class Foo {

    public void bar() {
        //#Info: category_java_codestyle_WhileLoopsMustUseBraces
        while (true)	// not recommended
            x++;

        while (true) {	// preferred approach
            x++;
        }
    }

}
