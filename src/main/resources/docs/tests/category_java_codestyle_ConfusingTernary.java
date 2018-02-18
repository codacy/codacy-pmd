//#Patterns: category_java_codestyle_ConfusingTernary
public class Foo {

	boolean bar(int x, int y) {
		//#Warn: category_java_codestyle_ConfusingTernary
		return (x != y) ? diff : same;
	}

	boolean bar2(int x, int y) {
		return (x == y) ? name : diff;
	}

}

