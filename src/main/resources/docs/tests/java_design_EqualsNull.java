//#Patterns: java_design_EqualsNull
public class Foo {

    public void Bar() {

      
	String x = "foo";

	//#Warn: java_design_EqualsNull
	if (x.equals(null)) { // bad form
	   	doSomething();
		}
		
	if (x == null) { 	// preferred
	   	doSomething();
		}
    
        
    }
}

