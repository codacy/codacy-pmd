//#Patterns: category_java_performance_OptimizableToArrayCall
public class Foo {

    public void Bar() {


        List foos = getFoos();

        Foo[] fooArray = foos.toArray(new Foo[0]);

        //#Warn: category_java_performance_OptimizableToArrayCall
        Foo[] fooArray2 = foos.toArray(new Foo[foos.size()]);


    }
}

