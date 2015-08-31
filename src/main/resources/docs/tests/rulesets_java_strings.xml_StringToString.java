//#Patterns: strings_StringToString
public class Foo {

    private String baz() {
        //#Warn: strings_StringToString
        String bar = "howdy"; return bar.toString();
    }
}

