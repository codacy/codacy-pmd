//#Patterns: unusedcode_UnusedLocalVariable

public class Foo {
    public void doSomething() {
        //#Warn: unusedcode_UnusedLocalVariable
        int i = 5; // Unused

        int foo = 5;

        System.out.println(foo);
    }
}

