//#Patterns: braces_IfStmtsMustUseBraces
public class Foo {

    public void bar() {

        //#Info: braces_IfStmtsMustUseBraces
        if (foo)	// not recommended
            x++;

        if (foo) {	// preferred approach
            x++;
        }
    }

}