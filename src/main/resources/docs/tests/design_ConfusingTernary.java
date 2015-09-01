//#Patterns: design_ConfusingTernary
public class Foo {

	boolean bar(int x, int y) {
		//#Info: design_ConfusingTernary
		return (x != y) ? diff : same;
	}

	boolean bar2(int x, int y) {
		return (x == y) ? name : diff;
	}

}

