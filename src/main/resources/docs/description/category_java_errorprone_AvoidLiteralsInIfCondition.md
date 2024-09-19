Since: PMD 4.2.6

Avoid using hard-coded literals in conditional statements. By declaring them as static variables
or private members with descriptive names maintainability is enhanced. By default, the literals &quot;-1&quot; and &quot;0&quot; are ignored.
More exceptions can be defined with the property &quot;ignoreMagicNumbers&quot;.

The rule doesn't consider deeper expressions by default, but this can be enabled via the property `ignoreExpressions`.
With this property set to false, if-conditions like `i == 1 + 5` are reported as well. Note that in that case,
the property ignoreMagicNumbers is not taken into account, if there are multiple literals involved in such an expression.

Example(s):
```
private static final int MAX_NUMBER_OF_REQUESTS = 10;

public void checkRequests() {

    if (i == 10) {                        // magic number, buried in a method
      doSomething();
    }

    if (i == MAX_NUMBER_OF_REQUESTS) {    // preferred approach
      doSomething();
    }

    if (aString.indexOf('.') != -1) {}     // magic number -1, by default ignored
    if (aString.indexOf('.') >= 0) { }     // alternative approach

    if (aDouble > 0.0) {}                  // magic number 0.0
    if (aDouble >= Double.MIN_VALUE) {}    // preferred approach

    // with rule property "ignoreExpressions" set to "false"
    if (i == pos + 5) {}  // violation: magic number 5 within an (additive) expression
    if (i == pos + SUFFIX_LENGTH) {} // preferred approach
}
```
