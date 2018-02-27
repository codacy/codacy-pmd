//#Patterns: category_java_codestyle_ForLoopShouldBeWhileLoop
public class Foo {
    void bar() {
        //#Info: category_java_codestyle_ForLoopShouldBeWhileLoop
        for (;true;) true; // No Init or Update part, may as well be: while (true)
    }
}
