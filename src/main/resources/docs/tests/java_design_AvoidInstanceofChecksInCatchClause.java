//#Patterns: java_design_AvoidInstanceofChecksInCatchClause
public class Foo {
    public void Bar() {

    	int i = 3;

		try { // Avoid this
		 // do something
			i++;

		} 
		catch (Exception ee) {
//#Warn: java_design_AvoidInstanceofChecksInCatchClause
            if (ee instanceof IOException) {
				cleanup();
			}
		}
		try {  // Prefer this:
		 // do something
		} catch (IOException ee) {
			cleanup();
		}

    }
}

