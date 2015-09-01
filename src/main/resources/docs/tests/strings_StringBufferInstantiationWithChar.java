//#Patterns: strings_StringBufferInstantiationWithChar
public class Foo {
    public void bar() {
        //#Warn: strings_StringBufferInstantiationWithChar
        StringBuffer output = new StringBuffer('a');
    }
}

