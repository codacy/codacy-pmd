Since: PMD 6.13.0

Apex test methods should have @isTest annotation.
As testMethod keyword is deprecated, Salesforce advices to use @isTest annotation for test class/methods.

Example(s):
```
@isTest
private class ATest {
    @isTest
    static void methodATest() {
    }
    static void methodBTest() {
    }
    @isTest static void methodCTest() {
        System.assert(1==2);
    }
    @isTest static void methodCTest() {
        System.debug('I am a debug statement');
    }
    private void fetchData() {
    }
}
```
