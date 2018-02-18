//#Patterns: category_java_errorprone_EqualsNull
public class Foo {

    public void Bar() {

      
	String x = "foo";

	//#Warn: category_java_errorprone_EqualsNull
	if (x.equals(null)) { // bad form
	   	doSomething();
		}
		
	if (x == null) { 	// preferred
	   	doSomething();
		}
    
        
    }
}

