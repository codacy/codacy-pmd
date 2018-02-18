//#Patterns: category_java_codestyle_AvoidFinalLocalVariable

public class Foo {

    public void bar() {
        
        //#Warn: category_java_codestyle_AvoidFinalLocalVariable
        final String simple;
        String hello;
    }

}
