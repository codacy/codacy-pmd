Since: PMD 1.8

Avoid throwing NullPointerExceptions manually. These are confusing because most people will assume that the
virtual machine threw it.  To avoid a method being called with a null parameter, you may consider
using an IllegalArgumentException instead, making it clearly seen as a programmer-initiated exception.
However, there are better ways to handle this:

&gt;*Effective Java, 3rd Edition, Item 72: Favor the use of standard exceptions*
&gt;
&gt;Arguably, every erroneous method invocation boils down to an illegal argument or state,
but other exceptions are standardly used for certain kinds of illegal arguments and states.
If a caller passes null in some parameter for which null values are prohibited, convention dictates that
NullPointerException be thrown rather than IllegalArgumentException.

To implement that, you are encouraged to use `java.util.Objects.requireNonNull()`
(introduced in Java 1.7). This method is designed primarily for doing parameter
validation in methods and constructors with multiple parameters.

Your parameter validation could thus look like the following:
```
public class Foo {
    private String exampleValue;

    void setExampleValue(String exampleValue) {
      // check, throw and assignment in a single standard call
      this.exampleValue = Objects.requireNonNull(exampleValue, &quot;exampleValue must not be null!&quot;);
    }
  }
```

Example(s):
```
public class Foo {
    void bar() {
        throw new NullPointerException();
    }
}
```
