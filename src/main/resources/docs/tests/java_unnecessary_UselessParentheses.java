//#Patterns: java_unnecessary_UselessParentheses

public class Foo {
    private int _bar1;

    public void bar() {
        //#Warn: java_unnecessary_UselessParentheses
        _bar1 = Integer.valueOf((n));

        _bar1 = Integer.valueOf(n); //the correct way
    }
}
