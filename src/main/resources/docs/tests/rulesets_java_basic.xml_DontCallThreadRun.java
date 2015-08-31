//#Patterns: basic_DontCallThreadRun
public class Foo {

    public void bar() {
        Thread t = new Thread();
        //#Warn: basic_DontCallThreadRun
        t.run();            // use t.start() instead
        //#Warn: basic_DontCallThreadRun
        new Thread().run(); // same violation
    }
}