//#Patterns: category_java_errorprone_UnnecessaryCaseChange

public class Foo {
    public void bar() {
//#Warn: category_java_errorprone_UnnecessaryCaseChange
boolean answer1 = buz.toUpperCase().equals("baz"); // should be buz.equalsIgnoreCase("baz") boolean answer2 = buz.toUpperCase().equalsIgnoreCase("baz"); // another unnecessary toUpperCase()


    }
}

