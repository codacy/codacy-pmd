Since: PMD 0.3

Fields, formal arguments, or local variable names that are too long can make the code difficult to follow.

Example(s):
```
public class Something {
	int reallyLongIntName = -3;  			// VIOLATION - Field
	public static void main( String argumentsList[] ) { // VIOLATION - Formal
		int otherReallyLongName = -5; 		// VIOLATION - Local
		for (int interestingIntIndex = 0;	// VIOLATION - For
             interestingIntIndex < 10;
             interestingIntIndex ++ ) {
    }
}
```
