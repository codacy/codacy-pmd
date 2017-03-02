//#Patterns: java_basic_MisplacedNullCheck
   
public class Foo {
	void bar() {
//#Warn: java_basic_MisplacedNullCheck
		if (a.equals(baz) && a != null) {}
		}
}


