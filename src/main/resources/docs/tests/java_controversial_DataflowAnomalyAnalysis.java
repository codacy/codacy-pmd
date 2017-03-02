//#Patterns: java_controversial_DataflowAnomalyAnalysis

public class Foo {

    public void bar() {
        //#Warn: java_controversial_DataflowAnomalyAnalysis
        int buz = 5;
        buz = 6;

        foo(buz);
        //#Warn: java_controversial_DataflowAnomalyAnalysis
        buz = 2;
    }

}
