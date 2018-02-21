//#Patterns: category_java_performance_StringToString
public class Foo {

    private String baz() {
        //#Warn: category_java_performance_StringToString
        String bar = "howdy"; return bar.toString();
    }
}

