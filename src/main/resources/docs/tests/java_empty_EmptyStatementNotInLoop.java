//#Patterns: java_empty_EmptyStatementNotInLoop

public class Foo {
    public void bar() {
        //#Info: java_empty_EmptyStatementNotInLoop
        ;

        //#Info: java_empty_EmptyStatementNotInLoop
        System.out.println("Lorem Ipsum");;
        
        System.out.println("Lorem Ipsum");
    }
}
