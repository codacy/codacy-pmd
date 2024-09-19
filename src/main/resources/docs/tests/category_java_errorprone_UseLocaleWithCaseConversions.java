//#Patterns: category_java_errorprone_UseLocaleWithCaseConversions


public class Foo {

    public void Bar() {

        x = "List";

    	//#Warn: category_java_errorprone_UseLocaleWithCaseConversions
		 boolean result = x.toLowerCase().equals("list");
	 
		 // GOOD
		 String z = a.toLowerCase(Locale.EN);

    }
}

