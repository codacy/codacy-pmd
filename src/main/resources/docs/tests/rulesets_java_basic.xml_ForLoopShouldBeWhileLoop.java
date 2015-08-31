//#Patterns: basic_ForLoopShouldBeWhileLoop
public class Foo {
    void bar() {
        //#Err: basic_ForLoopShouldBeWhileLoop
        for (;true;) true; // No Init or Update part, may as well be: while (true)
    }
}