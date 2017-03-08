Since: PMD 5.5.0

New objects created within loops should be checked to see if they can created outside them and reused.

Example(s):
```
public class Something {
	public static void main( String as[] ) {  
		for (Integer i = 0; i < 10; i++) {
			List<Account> accounts = [SELECT Id FROM Account];
		}
	}
}
```

[Source](https://pmd.github.io/pmd-5.5.4/pmd-apex/rules/apex/performance.html#AvoidSoqlInLoops)
