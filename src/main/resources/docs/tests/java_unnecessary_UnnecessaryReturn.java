//#Patterns: java_unnecessary_UnnecessaryReturn

public class Foo {
    public void bar() {
        //#Warn: java_unnecessary_UnnecessaryReturn
        return;
    }
}
