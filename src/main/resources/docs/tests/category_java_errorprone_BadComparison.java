//#Patterns: category_java_errorprone_BadComparison
public class Foo {

    public void Bar() {

		//#Warn: category_java_errorprone_BadComparison
		boolean x = (y == Double.NaN);
  

    }
}

