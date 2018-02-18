//#Patterns: category_java_design_ExcessivePublicCount : { "minimum": "5" }

//#Warn: category_java_design_ExcessivePublicCount
public class Foo {
    public String value;
    public Bar something;
    public Variable var;
    // [... more more public attributes ...]

    public void doWork() {}
    public void doMoreWork() {}
    public void doWorkAgain() {}
    // [... more more public methods ...]
}
