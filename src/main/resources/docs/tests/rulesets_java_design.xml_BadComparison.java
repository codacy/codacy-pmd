//#Patterns: design_BadComparison
public class Foo {

    public void Bar() {

		//#Info: design_BadComparison
		boolean x = (y == Double.NaN);
  

    }
}

