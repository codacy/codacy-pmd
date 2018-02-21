//#Patterns: category_java_multithreading_NonThreadSafeSingleton
public class Foo {

	private static Foo fooInstance = null;


	public static Foo getInstance() {
        //#Warn: category_java_multithreading_NonThreadSafeSingleton
	    if (fooInstance==null)
	        fooInstance = new Foo();
	    return fooInstance;
	}
}

public enum Poo {
	INSTANCE;

	public void methodA() {
		int i = 0;
	}
}

public class Bar {

	private static Bar barInstance = new Bar();

	public static Bar getInstance() {
	    return barInstance;
	}
}
