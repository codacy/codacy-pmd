//#Patterns: java_naming_SuspiciousHashcodeMethodName
public class Foo {
	//#Info: java_naming_SuspiciousHashcodeMethodName
    public int hashcode() {	// oops, this probably was supposed to be 'hashCode'
	
	}

	public int hashCode() {
	
	}
}