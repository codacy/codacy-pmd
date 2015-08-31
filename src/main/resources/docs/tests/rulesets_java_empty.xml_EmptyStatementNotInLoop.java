//#Patterns: empty_EmptyStatementNotInLoop

public class Foo {
    public void bar() {
        //#Err: empty_EmptyStatementNotInLoop
        ;

        //#Err: empty_EmptyStatementNotInLoop
        System.out.println("Lorem Ipsum");;
        
        System.out.println("Lorem Ipsum");
    }
}
