//#Patterns: category_java_errorprone_UnconditionalIfStatement


  
public class Foo {
	public void close() {
		//#Warn: category_java_errorprone_UnconditionalIfStatement
		if (true) {		// fixed conditional, not recommended
			// ...
		}
	}
}
