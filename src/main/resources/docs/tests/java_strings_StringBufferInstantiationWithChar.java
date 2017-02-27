//#Patterns: java_strings_StringBufferInstantiationWithChar
public class Foo {
    public void bar() {
        //#Warn: java_strings_StringBufferInstantiationWithChar
        StringBuffer output = new StringBuffer('a');
    }
}

