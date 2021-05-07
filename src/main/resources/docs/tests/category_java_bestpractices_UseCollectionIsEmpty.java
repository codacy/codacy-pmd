//#Patterns: category_java_bestpractices_UseCollectionIsEmpty
import java.util.List;

public class Foo {
	void good() {
		List foo = getList();
		if (foo.isEmpty()) {
			// blah
		}
	}

	void bad() {
		List foo = getList();
//#Warn: category_java_bestpractices_UseCollectionIsEmpty
		if (foo.size() == 0) {
				// blah
		}
	}
}
