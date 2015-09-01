Consider replacing Hashtable usage with the newer java.util.Map if thread safety is not required.

Ex:

public class Foo {
	void bar() {
		Hashtable h = new Hashtable();
	}
}

[SOURCE](https://pmd.github.io/pmd-5.3.3/pmd-java/rules/java/migrating.html#ReplaceHashtableWithMap)
