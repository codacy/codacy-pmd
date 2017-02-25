//#Patterns: java_controversial_OnlyOneReturn

public class Foo {

    public void bar(int x) {
        if (x > 0) {
            //#Warn: java_controversial_OnlyOneReturn
            return "hey";
        }

        return "hi";
    }

}
