Since: PMD 4.1

Application with hard-coded IP addresses can become impossible to deploy in some cases.
Externalizing IP adresses is preferable.

Example(s):
```
public class Foo {
	private String ip = "127.0.0.1"; 	// not recommended
}
```

[Source](https://pmd.github.io/pmd-5.6.1/pmd-java/rules/java/basic.html#AvoidUsingHardCodedIP)
