//#Patterns: category_java_errorprone_EmptySynchronizedBlock

public class Foo {
    public void bar() {
        //#Warn: category_java_errorprone_EmptySynchronizedBlock
        synchronized(this) {
        }
    }

    public void helper(int value) {
        int acc = 0;
        synchronized(this) {
            acc += value;
        }
    }
}
