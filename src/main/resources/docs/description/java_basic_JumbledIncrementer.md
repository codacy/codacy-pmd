Since: PMD 1.0

Avoid jumbled loop incrementers - its usually a mistake, and is confusing even if intentional.

Example(s):
```
public class JumbledIncrementerRule1 {
	public void foo() {
		for (int i = 0; i < 10; i++) {			// only references 'i'
			for (int k = 0; k < 20; i++) {		// references both 'i' and 'k'
				System.out.println("Hello");
			}
		}
	}
}
```
