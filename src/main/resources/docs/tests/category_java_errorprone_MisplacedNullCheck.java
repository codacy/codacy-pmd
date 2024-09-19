//#Patterns: category_java_errorprone_MisplacedNullCheck
   
public class Foo {
	void bar() {
//#Warn: category_java_errorprone_MisplacedNullCheck
		if (a.equals(baz) && a != null) {}
		}
}


