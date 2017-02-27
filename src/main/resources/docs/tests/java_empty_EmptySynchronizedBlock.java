//#Patterns: java_empty_EmptySynchronizedBlock

public class Foo {
    public void bar() {
        //#Info: java_empty_EmptySynchronizedBlock
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
