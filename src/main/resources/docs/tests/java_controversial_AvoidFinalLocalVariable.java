//#Patterns: java_controversial_AvoidFinalLocalVariable

public class Foo {

    public void bar() {
        
        //#Warn: java_controversial_AvoidFinalLocalVariable
        final String simple;
        String hello;
    }

}
