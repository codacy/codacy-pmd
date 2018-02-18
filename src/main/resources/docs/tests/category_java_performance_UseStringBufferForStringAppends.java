//#Patterns: category_java_performance_UseStringBufferForStringAppends

public class Foo {
    
    public void bar() {
        String a;
        a = "foo";
        //#Warn: category_java_performance_UseStringBufferForStringAppends
        a+=" bar";

        a = new StringBuilder("foo");
        a.append(" bar");
    }

}

