//#Patterns: category_java_multithreading_DoubleCheckedLocking

public class Foo {
    Object baz;
    //#Warn: category_java_multithreading_DoubleCheckedLocking
    Object bar() {
        if (baz == null) { // baz may be non-null yet not fully created
            synchronized(this) {
                if (baz == null) {
                    baz = new Object();
                }
            }
        }
        return baz;
    }
}
