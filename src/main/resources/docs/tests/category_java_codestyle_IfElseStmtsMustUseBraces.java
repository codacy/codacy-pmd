//#Patterns: category_java_codestyle_IfElseStmtsMustUseBraces
public class Foo {

    public void bar() {


        // this is OK
        if (foo) {
            x = x + 1;
        }
        else {
            x = x - 1;
        }

        if (foo)
            //#Info: category_java_codestyle_IfElseStmtsMustUseBraces
            x = x+1;
        else
            //#Info: category_java_codestyle_IfElseStmtsMustUseBraces
            x = x-1;
    }

}
