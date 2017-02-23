//#Patterns: java_basic_UnconditionalIfStatement


  
public class Foo {
	public void close() {
		//#Warn: java_basic_UnconditionalIfStatement
		if (true) {		// fixed conditional, not recommended
			// ...
		}
	}
}