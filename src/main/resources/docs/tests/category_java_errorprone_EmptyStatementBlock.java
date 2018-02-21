//#Patterns: category_java_errorprone_EmptyStatementBlock

public class Foo {
    private int _bar;

    public void lorem(int var) {
        //#Warn: category_java_errorprone_EmptyStatementBlock
        {}

        {_bar = var;} //this is okay
    }
}
