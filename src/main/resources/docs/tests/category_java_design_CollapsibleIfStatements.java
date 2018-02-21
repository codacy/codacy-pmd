//#Patterns: category_java_design_CollapsibleIfStatements
public class Foo {

	void bar() {
		if (x) {			// original implementation
            //#Warn: category_java_design_CollapsibleIfStatements
			if (y) {
				// do stuff
			}
		}
	}

	void zbar() {
		if (x && y) {		// optimized implementation
			// do stuff
		}
	}

}
