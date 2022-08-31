Since: PMD 5.5.1

Apex unit tests should include at least one assertion.  This makes the tests more robust, and using assert
with messages provide the developer a clearer idea of what the test does.  Custom assert method invocation
patterns can be specified using the 'additionalAssertMethodPattern' property if required.

Example(s):
```
@isTest
public class Foo {
    public static testMethod void testSomething() {
        Account a = null;
        // This is better than having a NullPointerException
        // System.assertNotEquals(a, null, 'account not found');
        a.toString();
    }
}
```
