//#Patterns: strings_StringInstantiation
public class Foo {

    public void bar() {
        //#Warn: strings_StringInstantiation
        String bar = new String("bar"); // just do a String bar = "bar";
    }
}

