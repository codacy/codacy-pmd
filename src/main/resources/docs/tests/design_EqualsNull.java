//#Patterns: design_EqualsNull
public class Foo {

    public void Bar() {

      
	String x = "foo";

	//#Err: design_EqualsNull
	if (x.equals(null)) { // bad form
	   	doSomething();
		}
		
	if (x == null) { 	// preferred
	   	doSomething();
		}
    
        
    }
}

