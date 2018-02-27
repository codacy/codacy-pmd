//#Patterns: category_java_codestyle_IfStmtsMustUseBraces
public class Foo {

    public void bar() {

        //#Info: category_java_codestyle_IfStmtsMustUseBraces
        if (foo)	// not recommended
            x++;

        if (foo) {	// preferred approach
            x++;
        }
    }

}
