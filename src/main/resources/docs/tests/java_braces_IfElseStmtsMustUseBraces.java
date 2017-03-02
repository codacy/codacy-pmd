//#Patterns: java_braces_IfElseStmtsMustUseBraces
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
            //#Info: java_braces_IfElseStmtsMustUseBraces
            x = x+1;
        else
            //#Info: java_braces_IfElseStmtsMustUseBraces
            x = x-1;
    }

}