//#Patterns: category_java_errorprone_StringBufferInstantiationWithChar
public class Foo {
    public void bar() {
        //#Warn: category_java_errorprone_StringBufferInstantiationWithChar
        StringBuffer output = new StringBuffer('a');
    }
}

