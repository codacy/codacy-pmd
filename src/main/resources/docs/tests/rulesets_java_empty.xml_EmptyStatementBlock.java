//#Patterns: empty_EmptyStatementBlock

public class Foo {
    private int _bar;

    public void lorem(int var) {
        //#Warn: empty_EmptyStatementBlock
        {}

        {_bar = var;} //this is okay
    }
}
