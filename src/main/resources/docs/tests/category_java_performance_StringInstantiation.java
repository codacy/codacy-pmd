//#Patterns: category_java_performance_StringInstantiation
public class Foo {

    public void bar() {
        //#Warn: category_java_performance_StringInstantiation
        String bar = new String("bar"); // just do a String bar = "bar";
    }
}

