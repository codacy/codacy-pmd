//#Patterns: controversial_DataflowAnomalyAnalysis

public class Foo {

    public void bar() {
        //#Info: controversial_DataflowAnomalyAnalysis
        int buz = 5;
        buz = 6;

        foo(buz);
        //#Info: controversial_DataflowAnomalyAnalysis
        buz = 2;
    }

}
