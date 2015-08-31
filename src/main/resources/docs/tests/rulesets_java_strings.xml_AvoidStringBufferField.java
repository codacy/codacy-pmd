//#Patterns: strings_AvoidStringBufferField

public class Foo {

    //#Warn: strings_AvoidStringBufferField
    public StringBuffer output = new StringBuffer("");

    public void bar() {

    }

}