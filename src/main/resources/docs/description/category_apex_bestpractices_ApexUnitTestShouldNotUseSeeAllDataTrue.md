Since: PMD 5.5.1

Apex unit tests should not use @isTest(seeAllData=true) because it opens up the existing database data for unexpected modification by tests.

Example(s):
```
@isTest(seeAllData = true)
public class Foo {
    public static testMethod void testSomething() {
        Account a = null;
        // This is better than having a NullPointerException
        // System.assertNotEquals(a, null, 'account not found');
        a.toString();
    }
}
```
