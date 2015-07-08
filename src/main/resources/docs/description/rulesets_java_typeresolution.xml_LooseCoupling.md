Avoid using implementation types (i.e., HashSet); use the interface (i.e, Set) instead.
You should always code to an interface. This way anything the map variable will treat it as type Map rather than HashMap.

This will allow you to swap out the underlying implementation of you *map* at a later date without having to change any code and, therefore, you are no longer tied to HashMap.

##Example

	import java.util.ArrayList; 
	import java.util.HashSet; 
	public class Bar { 
		// Use List instead 
		private ArrayList list = new ArrayList(); 
		// Use Set instead 
		public HashSet getFoo() { 
			return new HashSet(); 
		} 
	}

[SOURCE](http://pmd.sourceforge.net/pmd-5.3.2/pmd-java/rules/java/typeresolution.html#LooseCoupling)
