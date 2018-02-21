//#Patterns: category_java_errorprone_SuspiciousHashcodeMethodName
public class Foo {
	//#Warn: category_java_errorprone_SuspiciousHashcodeMethodName
    public int hashcode() {	// oops, this probably was supposed to be 'hashCode'
	
	}

	public int hashCode() {
	
	}
}
