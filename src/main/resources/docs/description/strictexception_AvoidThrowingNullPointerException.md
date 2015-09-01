Avoid throwing NullPointerExceptions. These are confusing because most people will assume that the virtual machine threw it. Consider using an IllegalArgumentException instead; this will be clearly seen as a programmer-initiated exception.

Ex:
  
public class Foo {
  void bar() {
    throw new NullPointerException();
  }
}

[SOURCE](https://pmd.github.io/pmd-5.3.3/pmd-java/rules/java/strictexception.html#AvoidThrowingNullPointerException)
