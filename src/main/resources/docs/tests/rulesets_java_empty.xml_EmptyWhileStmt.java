//#Patterns: empty_EmptyWhileStmt

public class Foo {
    public void bar(int a, int b) {
        //#Warn: empty_EmptyWhileStmt
        while(a == b) {
            //do nothing!
        }

        while(a < b) { //correct usage
            a++;
        }
    }
}
