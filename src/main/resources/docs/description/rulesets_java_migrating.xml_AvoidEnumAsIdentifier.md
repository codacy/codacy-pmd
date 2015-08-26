Use of the term ‘enum’ will conflict with newer versions of Java since it is a reserved word.

Ex:
  
public class A {
	public  class foo {
		String enum = "foo";
	}
}

[SOURCE](https://pmd.github.io/pmd-5.3.3/pmd-java/rules/java/migrating.html#AvoidEnumAsIdentifier)
