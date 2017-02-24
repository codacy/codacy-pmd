//#Patterns: java_design_UnsynchronizedStaticDateFormatter
public class Foo {
    private static final SimpleDateFormat sdf = new SimpleDateFormat();
    void bar() {
//#Warn: java_design_UnsynchronizedStaticDateFormatter
        sdf.format(); // poor, no thread-safety
    }
    synchronized void foo() {
        sdf.format(); // preferred
    }
}

