//#Patterns: category_java_codestyle_UselessParentheses

public class Foo {
    private int _bar1;

    public void bar() {
        //#Info: category_java_codestyle_UselessParentheses
        _bar1 = Integer.valueOf((n));

        _bar1 = Integer.valueOf(n); //the correct way
    }
}
