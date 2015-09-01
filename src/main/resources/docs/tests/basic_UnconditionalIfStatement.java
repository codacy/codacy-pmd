//#Patterns: basic_UnconditionalIfStatement


  
public class Foo {
	public void close() {
		//#Warn: basic_UnconditionalIfStatement
		if (true) {		// fixed conditional, not recommended
			// ...
		}
	}
}