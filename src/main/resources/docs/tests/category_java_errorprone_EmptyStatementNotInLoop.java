//#Patterns: category_java_errorprone_EmptyStatementNotInLoop

public class Foo {
    public void bar() {
        //#Warn: category_java_errorprone_EmptyStatementNotInLoop
        ;

        //#Warn: category_java_errorprone_EmptyStatementNotInLoop
        System.out.println("Lorem Ipsum");;
        
        System.out.println("Lorem Ipsum");
    }
}
