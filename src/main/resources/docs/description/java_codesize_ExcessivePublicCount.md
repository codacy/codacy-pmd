Since: PMD 1.04

Classes with large numbers of public methods and attributes require disproportionate testing efforts
since combinational side effects grow rapidly and increase risk. Refactoring these classes into
smaller ones not only increases testability and reliability but also allows new variations to be
developed easily.

Example(s):
```
public class Foo {
	public String value;
	public Bar something;
	public Variable var;
 // [... more more public attributes ...]
 
	public void doWork() {}
	public void doMoreWork() {}
	public void doWorkAgain() {}
 // [... more more public methods ...]
}
```

[Source](https://pmd.github.io/pmd-5.6.1/pmd-java/rules/java/codesize.html#ExcessivePublicCount)
