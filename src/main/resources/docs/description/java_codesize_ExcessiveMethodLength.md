Since: PMD 0.6

When methods are excessively long this usually indicates that the method is doing more than its
name/signature might suggest. They also become challenging for others to digest since excessive 
scrolling causes readers to lose focus.
Try to reduce the method length by creating helper methods and removing any copy/pasted code.

Example(s):
```
public void doSomething() {
	System.out.println("Hello world!");
	System.out.println("Hello world!");
		// 98 copies omitted for brevity.
}
```

[Source](https://pmd.github.io/pmd-5.6.1/pmd-java/rules/java/codesize.html#ExcessiveMethodLength)
