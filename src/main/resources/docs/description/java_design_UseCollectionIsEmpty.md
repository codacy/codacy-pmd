Since: PMD 3.9

The isEmpty() method on java.util.Collection is provided to determine if a collection has any elements.
Comparing the value of size() to 0 does not convey intent as well as the isEmpty() method.

Example(s):
```
public class Foo {
	void good() {
       	List foo = getList();
		if (foo.isEmpty()) {
			// blah
		}
   	}

    void bad() {
   	    List foo = getList();
			if (foo.size() == 0) {
				// blah
			}
    	}
}
```

[Source](https://pmd.github.io/pmd-5.6.1/pmd-java/rules/java/design.html#UseCollectionIsEmpty)
