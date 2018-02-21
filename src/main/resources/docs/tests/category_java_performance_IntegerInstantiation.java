//#Patterns: category_java_performance_IntegerInstantiation
public class Foo {
    public void bar() {
        //#Warn: category_java_performance_IntegerInstantiation
        new Integer("a");
    }
}

