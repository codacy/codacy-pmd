//#Patterns: java_design_UncommentedEmptyConstructor
public class Foo {

	public Foo() {
  	// This constructor is intentionally empty. Nothing special is needed here.
	}
}

public class Bar {

	//#Warn: java_design_UncommentedEmptyConstructor
	public Bar() {
	}
}
