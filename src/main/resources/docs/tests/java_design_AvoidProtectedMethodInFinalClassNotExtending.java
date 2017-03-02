//#Patterns: java_design_AvoidProtectedMethodInFinalClassNotExtending
public final class Foo {

	int barx() {

    }

 	private int bar() {

    }
    //#Warn: java_design_AvoidProtectedMethodInFinalClassNotExtending
  	protected int baz() {

    }
}

