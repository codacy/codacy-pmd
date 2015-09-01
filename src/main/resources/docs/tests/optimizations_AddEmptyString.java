//#Patterns: optimizations_AddEmptyString

public class Foo {

    public void bar() {
        
        //#Warn: optimizations_AddEmptyString
        String s = "" + 123;
        String t = Integer.toString(456);
    }

}
