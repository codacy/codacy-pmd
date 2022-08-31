Since: PMD 5.5.3

The rule validates you are checking for access permissions before a SOQL/SOSL/DML operation.
Since Apex runs in system mode not having proper permissions checks results in escalation of
privilege and may produce runtime errors. This check forces you to handle such scenarios.

By default, the rule allows access checks can be performed using system Apex provisions such as
`DescribeSObjectResult.isAccessible/Createable/etc.`, the SOQL `WITH SECURITY_ENFORCED` clause,
or using the open source [Force.com ESAPI](https://github.com/forcedotcom/force-dot-com-esapi)
class library. Because it is common to use authorization facades to assist with this task, the
rule also allows configuration of regular expression-based patterns for the methods used to
authorize each type of CRUD operation. These pattern are configured via the following properties:

* `createAuthMethodPattern`/`createAuthMethodTypeParamIndex` - a pattern for the method used
  for create authorization and an optional 0-based index of the parameter passed to that method
  that denotes the `SObjectType` being authorized for create.
* `readAuthMethodPattern`/`readAuthMethodTypeParamIndex` - a pattern for the method used
  for read authorization and an optional 0-based index of the parameter passed to that method
  that denotes the `SObjectType` being authorized for read.
* `updateAuthMethodPattern`/`updateAuthMethodTypeParamIndex` - a pattern for the method used
  for update authorization and an optional 0-based index of the parameter passed to that method
  that denotes the `SObjectType` being authorized for update.
* `deleteAuthMethodPattern`/`deleteAuthMethodTypeParamIndex` - a pattern for the method used
  for delete authorization and an optional 0-based index of the parameter passed to that method
  that denotes the `SObjectType` being authorized for delete.
* `undeleteAuthMethodPattern`/`undeleteAuthMethodTypeParamIndex` - a pattern for the method used
  for undelete authorization and an optional 0-based index of the parameter passed to that method
  that denotes the `SObjectType` being authorized for undelete.
* `mergeAuthMethodPattern`/`mergeAuthMethodTypeParamIndex` - a pattern for the method used
  for merge authorization and an optional 0-based index of the parameter passed to that method
  that denotes the `SObjectType` being authorized for merge.

The following example shows how the rule can be configured for the
[sirono-common](https://github.com/SCWells72/sirono-common)
[`AuthorizationUtil`](https://github.com/SCWells72/sirono-common#authorization-utilities) class:

```xml
&lt;rule ref=&quot;category/apex/security.xml/ApexCRUDViolation&quot; message=&quot;Validate CRUD permission before SOQL/DML operation&quot;&gt;
    &lt;priority&gt;3&lt;/priority&gt;
    &lt;properties&gt;
        &lt;property name=&quot;createAuthMethodPattern&quot; value=&quot;AuthorizationUtil\.(is|assert)(Createable|Upsertable)&quot;/&gt;
        &lt;property name=&quot;readAuthMethodPattern&quot; value=&quot;AuthorizationUtil\.(is|assert)Accessible&quot;/&gt;
        &lt;property name=&quot;updateAuthMethodPattern&quot; value=&quot;AuthorizationUtil\.(is|assert)(Updateable|Upsertable)&quot;/&gt;
        &lt;property name=&quot;deleteAuthMethodPattern&quot; value=&quot;AuthorizationUtil\.(is|assert)Deletable&quot;/&gt;
        &lt;property name=&quot;undeleteAuthMethodPattern&quot; value=&quot;AuthorizationUtil\.(is|assert)Undeletable&quot;/&gt;
        &lt;property name=&quot;mergeAuthMethodPattern&quot; value=&quot;AuthorizationUtil\.(is|assert)Mergeable&quot;/&gt;
    &lt;/properties&gt;
&lt;/rule&gt;
```

Note: This rule will produce false positives for VF getter methods. In VF getters the access permission
check happens automatically and is not needed explicitly. However, the rule can't reliably determine
whether a getter is a VF getter or not and reports a violation in any case. In such cases, the violation
should be [suppressed](pmd_userdocs_suppressing_warnings.html).

Example(s):
```
public class Foo {
    public Contact foo(String status, String ID) {

        // validate you can actually query what you intend to retrieve
        Contact c = [SELECT Status__c FROM Contact WHERE Id=:ID WITH SECURITY_ENFORCED];

        // Make sure we can update the database before even trying
        if (!Schema.sObjectType.Contact.fields.Status__c.isUpdateable()) {
            return null;
        }

        c.Status__c = status;
        update c;
        return c;
    }
}
```
