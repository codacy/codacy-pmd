//#Patterns: java_strings_UselessStringValueOf
public class Foo {

    public String convert(int i) {
        //#Warn: java_strings_UselessStringValueOf
        String s; s = "a" + String.valueOf(i); // not required s = "a" + i; // preferred approach return s;
    }


}

