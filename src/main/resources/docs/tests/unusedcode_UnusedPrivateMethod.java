//#Patterns: unusedcode_UnusedPrivateMethod

public class Something {
    //#Warn: unusedcode_UnusedPrivateMethod
    private void foo() {
        System.out.print("This private method is NOT called!");
    } // unused

    private void bar() {
        System.out.print("This private method is called!");
    }

    public void doSomething() {
        bar();
    }
}