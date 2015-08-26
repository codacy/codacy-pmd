Avoid throwing certain exception types. Rather than throw a raw RuntimeException, Throwable, Exception, or Error, use a subclassed exception or error instead.

Ex:
      
public class Foo {
  public void bar() throws Exception {
    throw new Exception();
   }
}

[SOURCE](https://pmd.github.io/pmd-5.3.3/pmd-java/rules/java/strictexception.html#AvoidThrowingRawExceptionTypes)
