//#Patterns: java_design_BadComparison
public class Foo {

    public void Bar() {

		//#Warn: java_design_BadComparison
		boolean x = (y == Double.NaN);
  

    }
}

