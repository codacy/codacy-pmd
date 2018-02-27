//#Patterns: category_java_codestyle_OnlyOneReturn

public class Foo {

    public void bar(int x) {
        if (x > 0) {
            //#Info: category_java_codestyle_OnlyOneReturn
            return "hey";
        }

        return "hi";
    }

}
