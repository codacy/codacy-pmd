Since: PMD 3.1

The use of the '+=' operator for appending strings causes the JVM to create and use an internal StringBuffer.
If a non-trivial number of these concatenations are being used then the explicit use of a StringBuilder or
threadsafe StringBuffer is recommended to avoid this.

Example(s):
```
public class Foo {
    String inefficientConcatenation() {
        String result = "";
        for (int i = 0; i < 10; i++) {
            // warning: this concatenation will create one new StringBuilder per iteration
            result += getStringFromSomeWhere(i);
        }
        return result;
    }

    String efficientConcatenation() {
        // better would be to use one StringBuilder for the entire loop
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            result.append(getStringFromSomeWhere(i));
        }
        return result.toString();
    }
}
```
