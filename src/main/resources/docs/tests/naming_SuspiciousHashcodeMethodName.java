//#Patterns: naming_SuspiciousHashcodeMethodName
public class Foo {
	//#Err: naming_SuspiciousHashcodeMethodName
    public int hashcode() {	// oops, this probably was supposed to be 'hashCode'
	
	}

	public int hashCode() {
	
	}
}