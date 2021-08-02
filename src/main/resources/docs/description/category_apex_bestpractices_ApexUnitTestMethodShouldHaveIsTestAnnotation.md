Since: PMD 6.13.0

Apex test methods should have `@isTest` annotation instead of the `testMethod` keyword,
as `testMethod` is deprecated.
Salesforce advices to use [@isTest](https://developer.salesforce.com/docs/atlas.en-us.apexcode.meta/apexcode/apex_classes_annotation_isTest.htm)
annotation for test classes and methods.

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
    static testmethod void methodCTest() {
        System.debug('I am a debug statement');
    }
    private void fetchData() {
    }
}
```
