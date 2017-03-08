Since: PMD 3.0

ArrayList is a much better Collection implementation than Vector if thread-safe operation is not required.

Example(s):
```
public class SimpleTest extends TestCase {
	public void testX() {
		Collection c1 = new Vector();		
		Collection c2 = new ArrayList();	// achieves the same with much better performance
	}
}
```

[Source](https://pmd.github.io/pmd-5.5.4/pmd-java/rules/java/optimizations.html#UseArrayListInsteadOfVector)
