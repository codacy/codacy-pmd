//#Patterns: basic_MisplacedNullCheck
   
public class Foo {
	void bar() {
//#Err: basic_MisplacedNullCheck
		if (a.equals(baz) && a != null) {}
		}
}


