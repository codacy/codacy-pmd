Since: PMD 6.8.0

This rule validates that:

*   ApexDoc comments are present for classes, methods, and properties that are public or global, excluding
    overrides and test classes (as well as the contents of test classes).
*   ApexDoc comments are present for classes, methods, and properties that are protected or private, depending
    on the properties `reportPrivate` and `reportProtected`.
*   ApexDoc comments should contain @description depending on the property `reportMissingDescription`.
*   ApexDoc comments on non-void, non-constructor methods should contain @return.
*   ApexDoc comments on void or constructor methods should not contain @return.
*   ApexDoc comments on methods with parameters should contain @param for each parameter, in the same
    order as the method signature.
*   ApexDoc comments are present on properties is only validated, if the property `reportProperty` is enabled.
    By setting `reportProperty` to false, you can ignore missing comments on properties.

Method overrides and tests are both exempted from having ApexDoc.

Example(s):
```
/**
 * @description Hello World
 */
public class HelloWorld {
    /**
     * @description Bar
     * @return Bar
     */
    public Object bar() { return null; }
}
```
