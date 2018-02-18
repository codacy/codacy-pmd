//#Patterns: category_java_bestpractices_UseVarargs
public class Foo {
	//#Warn: category_java_bestpractices_UseVarargs
   void fooo(String s, Object[] args) {
      // Do something here...
   }
    public void fooozz(String s, Object... args) {
        int i = 0;
        i++;
    }

}
