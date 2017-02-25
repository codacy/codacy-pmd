//#Patterns: java_braces_WhileLoopsMustUseBraces
public class Foo {

    public void bar() {
        //#Info: java_braces_WhileLoopsMustUseBraces
        while (true)	// not recommended
            x++;

        while (true) {	// preferred approach
            x++;
        }
    }

}