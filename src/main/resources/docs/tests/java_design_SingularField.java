//#Patterns: java_design_SingularField


public class Foo {
	//#Warn: java_design_SingularField
    private int x;  // no reason to exist at the Foo instance level
    private int z;
    
	public Foo() {
		int z = 0;
	}

    public void bar(int y) {
     x = y + 5;
     return x;
    }

    public void bar2(int y) {
     z += y;
     return z;
    }
}
   