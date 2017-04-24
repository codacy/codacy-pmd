Since: PMD 5.5.0

A variable naming conventions rule - customize this to your liking.  Currently, it
checks for final variables that should be fully capitalized and non-final variables
that should not include underscores.

Example(s):
```
public class Foo {
	public static final Integer MY_NUM = 0;
	public String myTest = '';
	DataModule dmTest = new DataModule();
}
```
