//#Patterns: category_java_errorprone_AssignmentInOperand

public class Foo {

    public void bar() {
        int x = 2;

        //#Warn: category_java_errorprone_AssignmentInOperand
        if ((x = getX()) == 3) {
            //insert code
        }

        x = getX();
        if(x == 3) {
            //insert code
        }
    }

}
