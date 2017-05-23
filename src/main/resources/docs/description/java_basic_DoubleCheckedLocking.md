Since: PMD 1.04

Partially created objects can be returned by the Double Checked Locking pattern when used in Java.
An optimizing JRE may assign a reference to the baz variable before it calls the constructor of the object the
reference points to.

Note: With Java 5, you can make Double checked locking work, if you declare the variable to be `volatile`.

For more details refer to: http://www.javaworld.com/javaworld/jw-02-2001/jw-0209-double.html
or http://www.cs.umd.edu/~pugh/java/memoryModel/DoubleCheckedLocking.html

Example(s):
```
public class Foo {
	/*volatile */ Object baz = null; // fix for Java5 and later: volatile
	Object bar() {
		if (baz == null) { // baz may be non-null yet not fully created
			synchronized(this) {
				if (baz == null) {
					baz = new Object();
        		}
      		}
    	}
		return baz;
	}
}
```
