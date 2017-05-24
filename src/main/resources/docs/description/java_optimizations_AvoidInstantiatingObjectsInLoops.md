Since: PMD 2.2

New objects created within loops should be checked to see if they can created outside them and reused.

Example(s):
```
public class Something {
	public static void main( String as[] ) {  
		for (int i = 0; i < 10; i++) {
		    Foo f = new Foo(); // Avoid this whenever you can it's really expensive
		}
	}
}
```
