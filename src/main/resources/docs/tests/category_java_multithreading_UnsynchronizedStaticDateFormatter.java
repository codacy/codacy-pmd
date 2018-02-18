//#Patterns: category_java_multithreading_UnsynchronizedStaticDateFormatter
public class Foo {
    private static final SimpleDateFormat sdf = new SimpleDateFormat();
    void bar() {
//#Warn: category_java_multithreading_UnsynchronizedStaticDateFormatter
        sdf.format(); // poor, no thread-safety
    }
    synchronized void foo() {
        sdf.format(); // preferred
    }
}

