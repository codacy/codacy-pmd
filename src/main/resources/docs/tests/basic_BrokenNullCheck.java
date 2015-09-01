//#Patterns: basic_BrokenNullCheck

public class Foo {

    public String bar(String string) {
        // should be &&
        //#Err: basic_BrokenNullCheck
        if (string != null || !string.equals(""))
            return string;
        // should be ||
        //#Err: basic_BrokenNullCheck
        if (string == null && string.equals(""))
            return string;
    }
}