//#Patterns: category_java_multithreading_DontCallThreadRun
public class Foo {

    public void bar() {
        Thread t = new Thread();
        //#Warn: category_java_multithreading_DontCallThreadRun
        t.run();            // use t.start() instead
        //#Warn: category_java_multithreading_DontCallThreadRun
        new Thread().run(); // same violation
    }
}
