//#Patterns: java_strings_AvoidStringBufferField

public class Foo {

    //#Warn: java_strings_AvoidStringBufferField
    public StringBuffer output = new StringBuffer("");

    public void bar() {

    }

}