//#Patterns: category_java_codestyle_MethodArgumentCouldBeFinal
public class Foo {

    //#Info: category_java_codestyle_MethodArgumentCouldBeFinal
    public void bar(int i) {
        //do something here
    }

    public void correct(final int i) {
        //the correct way
    }

}
