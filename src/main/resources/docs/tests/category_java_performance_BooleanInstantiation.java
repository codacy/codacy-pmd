//#Patterns: category_java_performance_BooleanInstantiation
public class Foo {
    public void bar() {

//#Warn: category_java_performance_BooleanInstantiation
Boolean bar = new Boolean("true");		// unnecessary creation, just reference Boolean.TRUE;
//#Warn: category_java_performance_BooleanInstantiation
Boolean buz = Boolean.valueOf(false);	// ...., just reference Boolean.FALSE;

Boolean zbar = Boolean.TRUE;		// unnecessary creation, just reference Boolean.TRUE;
Boolean zbuz = Boolean.FALSE;
    }
}

