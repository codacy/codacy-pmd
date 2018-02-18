//#Patterns: category_java_performance_AddEmptyString

public class Foo {

    public void bar() {
        
        //#Warn: category_java_performance_AddEmptyString
        String s = "" + 123;
        String t = Integer.toString(456);
    }

}
