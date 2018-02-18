//#Patterns: category_java_errorprone_EmptyIfStmt

public class Foo {
    public void bar(int x) {
        //#Warn: category_java_errorprone_EmptyIfStmt
        if(x == 0) {  }
    }
}
