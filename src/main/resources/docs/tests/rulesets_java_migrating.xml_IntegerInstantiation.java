//#Patterns: migrating_IntegerInstantiation
public class Foo {
    public void bar() {
        //#Warn: migrating_IntegerInstantiation
        new Integer("a");
    }
}

