//#Patterns: controversial_AvoidFinalLocalVariable

public class Foo {

    public void bar() {
        
        //#Err: controversial_AvoidFinalLocalVariable
        final String simple;
        String hello;
    }

}
