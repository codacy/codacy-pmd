Since: PMD 5.5.1

Apex unit tests should include at least one assertion.  This makes the tests more robust, and using assert
            with messages provide the developer a clearer idea of what the test does.

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

[Source](https://pmd.github.io/pmd-5.6.1/pmd-apex/rules/apex/apexunit.html#ApexUnitTestClassShouldHaveAsserts)
