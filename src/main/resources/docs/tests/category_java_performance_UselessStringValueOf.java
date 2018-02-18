//#Patterns: category_java_performance_UselessStringValueOf
public class Foo {

    public String convert(int i) {
        //#Warn: category_java_performance_UselessStringValueOf
        String s; s = "a" + String.valueOf(i); // not required s = "a" + i; // preferred approach return s;
    }


}

