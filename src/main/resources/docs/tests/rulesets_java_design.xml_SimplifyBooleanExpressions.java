//#Patterns: design_SimplifyBooleanExpressions

public class Bar {
    // can be simplified to
    // bar = isFoo();
    //#Err: design_SimplifyBooleanExpressions
    private boolean bar = (isFoo() == true);

    public isFoo() { return false;}
}