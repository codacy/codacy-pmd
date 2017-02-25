//#Patterns: java_braces_IfStmtsMustUseBraces
public class Foo {

    public void bar() {

        //#Info: java_braces_IfStmtsMustUseBraces
        if (foo)	// not recommended
            x++;

        if (foo) {	// preferred approach
            x++;
        }
    }

}