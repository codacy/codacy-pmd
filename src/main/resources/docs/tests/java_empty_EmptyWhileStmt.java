//#Patterns: java_empty_EmptyWhileStmt

public class Foo {
    public void bar(int a, int b) {
        //#Info: java_empty_EmptyWhileStmt
        while(a == b) {
            //do nothing!
        }

        while(a < b) { //correct usage
            a++;
        }
    }
}
