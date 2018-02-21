//#Patterns: category_java_bestpractices_AvoidStringBufferField

public class Foo {

    //#Warn: category_java_bestpractices_AvoidStringBufferField
    public StringBuffer output = new StringBuffer("");

    public void bar() {

    }

}
