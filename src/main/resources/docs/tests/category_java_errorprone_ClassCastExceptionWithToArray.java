//#Patterns: category_java_errorprone_ClassCastExceptionWithToArray
public class Foo {
    public void bar() {

		Collection c = new ArrayList();
		Integer obj = new Integer(1);
		c.add(obj);

		    
		//#Warn: category_java_errorprone_ClassCastExceptionWithToArray
		Integer[] a = (Integer [])c.toArray();

		   // this is fine and will not trigger the rule
		Integer[] b = (Integer [])c.toArray(new Integer[c.size()]);


    }
}

