//#Patterns: java_basic_BrokenNullCheck

public class Foo {

    public String bar(String string) {
        // should be &&
        //#Warn: java_basic_BrokenNullCheck
        if (string != null || !string.equals(""))
            return string;
        // should be ||
        //#Warn: java_basic_BrokenNullCheck
        if (string == null && string.equals(""))
            return string;
    }
}