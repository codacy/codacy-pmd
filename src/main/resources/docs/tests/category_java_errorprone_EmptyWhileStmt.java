//#Patterns: category_java_errorprone_EmptyWhileStmt

public class Foo {
    public void bar(int a, int b) {
        //#Warn: category_java_errorprone_EmptyWhileStmt
        while(a == b) {
            //do nothing!
        }

        while(a < b) { //correct usage
            a++;
        }
    }
}
