//#Patterns: empty_EmptyIfStmt

public class Foo {
    public void bar(int x) {
        //#Warn: empty_EmptyIfStmt
        if(x == 0) {  }
    }
}
