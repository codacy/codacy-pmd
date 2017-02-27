//#Patterns: java_basic_CollapsibleIfStatements
public class Foo {

	void bar() {
		if (x) {			// original implementation
            //#Warn: java_basic_CollapsibleIfStatements
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