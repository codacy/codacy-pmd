//#Patterns: category_java_performance_UseIndexOfChar

public class Foo {

    public void bar() {

        String s = "hello world";

        // avoid this
        //#Warn: category_java_performance_UseIndexOfChar
        if (s.indexOf("d") == 1) {

        }

        // instead do this
        if (s.indexOf('d') == 1) {

        }
    }
}

