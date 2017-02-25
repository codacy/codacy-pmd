//#Patterns: java_basic_DontCallThreadRun
public class Foo {

    public void bar() {
        Thread t = new Thread();
        //#Warn: java_basic_DontCallThreadRun
        t.run();            // use t.start() instead
        //#Warn: java_basic_DontCallThreadRun
        new Thread().run(); // same violation
    }
}