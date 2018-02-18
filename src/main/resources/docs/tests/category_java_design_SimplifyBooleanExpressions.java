//#Patterns: category_java_design_SimplifyBooleanExpressions

public class Bar {
    // can be simplified to
    // bar = isFoo();
    //#Warn: category_java_design_SimplifyBooleanExpressions
    private boolean bar = (isFoo() == true);

    public isFoo() { return false;}
}
