//#Patterns: controversial_OnlyOneReturn

public class Foo {

    public void bar(int x) {
        if (x > 0) {
            //#Err: controversial_OnlyOneReturn
            return "hey";
        }

        return "hi";
    }

}
