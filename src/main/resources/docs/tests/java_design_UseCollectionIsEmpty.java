//#Patterns: java_design_UseCollectionIsEmpty

public class Foo {
	void good() {
		List foo = getList();
		if (foo.isEmpty()) {
			// blah
		}
	}

	void bad() {
		List foo = getList();
//#Warn: java_design_UseCollectionIsEmpty
		if (foo.size() == 0) {
				// blah
		}
	}
}