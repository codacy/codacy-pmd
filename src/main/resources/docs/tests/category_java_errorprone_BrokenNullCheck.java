//#Patterns: category_java_errorprone_BrokenNullCheck

public class Foo {

    public String bar(String string) {
        // should be &&
        //#Warn: category_java_errorprone_BrokenNullCheck
        if (string != null || !string.equals(""))
            return string;
        // should be ||
        //#Warn: category_java_errorprone_BrokenNullCheck
        if (string == null && string.equals(""))
            return string;
    }
}
