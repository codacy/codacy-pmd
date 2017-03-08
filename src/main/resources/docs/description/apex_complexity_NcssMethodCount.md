Since: PMD 5.5.0

This rule uses the NCSS (Non-Commenting Source Statements) algorithm to determine the number of lines
of code for a given method. NCSS ignores comments, and counts actual statements. Using this algorithm,
lines of code that are split are counted as one.

Example(s):
```
public class Foo extends Bar {
	//this method only has 1 NCSS lines
	public Integer methd() {
		super.methd();
		
		
		
		return 1;
	}
}
```

[Source](https://pmd.github.io/pmd-5.5.4/pmd-apex/rules/apex/complexity.html#NcssMethodCount)
