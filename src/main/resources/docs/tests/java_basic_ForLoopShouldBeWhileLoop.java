//#Patterns: java_basic_ForLoopShouldBeWhileLoop
public class Foo {
    void bar() {
        //#Warn: java_basic_ForLoopShouldBeWhileLoop
        for (;true;) true; // No Init or Update part, may as well be: while (true)
    }
}