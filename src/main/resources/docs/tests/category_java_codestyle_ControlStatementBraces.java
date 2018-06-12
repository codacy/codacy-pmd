//#Patterns: category_java_codestyle_ControlStatementBraces
public class Foo {

    public void bar() {
        //#Info: category_java_codestyle_ControlStatementBraces
        while (true)	// not recommended
            x++;

        while (true) {	// preferred approach
            x++;
        }
    }

    public void baz() {
        //#Info: category_java_codestyle_ControlStatementBraces
        for (int i = 0; i < 42; i++)
            foo();


        for (int i = 0; i < 42; i++) {
            foo();
        }
    }

   public void foo() {
        // this is OK
        if (foo) {
            x = x + 1;
        }
        else {
            x = x - 1;
        }

        if (foo)
            //#Info: category_java_codestyle_ControlStatementBraces
            x = x+1;
        else
            //#Info: category_java_codestyle_ControlStatementBraces
            x = x-1;
    }

    public void foobar() {
        if (foo)	// not recommended
            //#Info: category_java_codestyle_ControlStatementBraces
            x++;

        if (foo) {	// preferred approach
            x++;
        }
    }

}
