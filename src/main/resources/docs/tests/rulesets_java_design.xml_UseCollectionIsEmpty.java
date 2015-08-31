//#Patterns: design_UseCollectionIsEmpty

public class Foo {
	void good() {
		List foo = getList();
		if (foo.isEmpty()) {
			// blah
		}
	}

	void bad() {
		List foo = getList();
//#Info: design_UseCollectionIsEmpty
		if (foo.size() == 0) {
				// blah
		}
	}
}