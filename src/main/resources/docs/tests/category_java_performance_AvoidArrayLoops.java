//#Patterns: category_java_performance_AvoidArrayLoops

public class Foo {

    public void bar() {
        int [] a = new int[10];
        int [] b = new int[10];

        //#Warn: category_java_performance_AvoidArrayLoops
        for (int i = 0; i < 10; i++) {
            b[i] = a[i];
        }

        System.arraycopy(a, 0, b, 0, 10);
    }

}
