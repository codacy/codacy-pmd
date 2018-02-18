//#Patterns: category_java_codestyle_AvoidProtectedMethodInFinalClassNotExtending
public final class Foo {

	int barx() {

    }

 	private int bar() {

    }
    //#Warn: category_java_codestyle_AvoidProtectedMethodInFinalClassNotExtending
  	protected int baz() {

    }
}

