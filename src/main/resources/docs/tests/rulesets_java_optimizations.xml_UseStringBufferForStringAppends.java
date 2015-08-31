//#Patterns: optimizations_UseStringBufferForStringAppends

public class Foo {
    
    public void bar() {
        String a;
        a = "foo";
        //#Warn: optimizations_UseStringBufferForStringAppends
        a+=" bar";

        a = new StringBuilder("foo");
        a.append(" bar");
    }

}

