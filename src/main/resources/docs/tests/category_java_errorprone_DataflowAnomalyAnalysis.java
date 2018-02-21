//#Patterns: category_java_errorprone_DataflowAnomalyAnalysis

public class Foo {

    public void bar() {
        //#Warn: category_java_errorprone_DataflowAnomalyAnalysis
        int buz = 5;
        buz = 6;

        foo(buz);
        //#Warn: category_java_errorprone_DataflowAnomalyAnalysis
        buz = 2;
    }

}
