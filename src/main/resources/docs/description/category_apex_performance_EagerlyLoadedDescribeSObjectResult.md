Since: PMD 6.40.0

This rule finds `DescribeSObjectResult`s which could have been loaded eagerly via `SObjectType.getDescribe()`.

When using `SObjectType.getDescribe()` or `Schema.describeSObjects()` without supplying a `SObjectDescribeOptions`,
implicitly it will be using `SObjectDescribeOptions.DEFAULT` and then all
child relationships will be loaded eagerly regardless whether this information is needed or not.
This has a potential negative performance impact. Instead [`SObjectType.getDescribe(options)`](https://developer.salesforce.com/docs/atlas.en-us.apexref.meta/apexref/apex_class_Schema_SObjectType.htm#unique_346834793)
or [`Schema.describeSObjects(SObjectTypes, options)`](https://developer.salesforce.com/docs/atlas.en-us.apexref.meta/apexref/apex_methods_system_schema.htm#apex_System_Schema_describeSObjects)
should be used and a `SObjectDescribeOptions` should be supplied. By using
`SObjectDescribeOptions.DEFERRED` the describe attributes will be lazily initialized at first use.

Lazy loading `DescribeSObjectResult` on picklist fields is not always recommended. The lazy loaded
describe objects might not be 100% accurate. It might be safer to explicitly use
`SObjectDescribeOptions.FULL` in such a case. The same applies when you need the same `DescribeSObjectResult`
to be consistent across different contexts and API versions.

Properties:

* `noDefault`: The behavior of `SObjectDescribeOptions.DEFAULT` changes from API Version 43 to 44:
    With API Version 43, the attributes are loaded eagerly. With API Version 44, they are loaded lazily.
    Simply using `SObjectDescribeOptions.DEFAULT` doesn't automatically make use of lazy loading.
    (unless &quot;Use Improved Schema Caching&quot; critical update is applied, `SObjectDescribeOptions.DEFAULT` does fallback
    to lazy loading)
    With this property enabled, such usages are found.
    You might ignore this, if you can make sure, that you don't run a mix of API Versions.

Example(s):
```
public class Foo {
    public static void bar(List<Account> accounts) {
        if (Account.SObjectType.getDescribe(SObjectDescribeOptions.DEFERRED).isCreateable()) {
            insert accounts;
        }
    }
}
```
