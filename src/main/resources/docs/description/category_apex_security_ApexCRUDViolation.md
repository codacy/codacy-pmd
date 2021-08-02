Since: PMD 5.5.3

The rule validates you are checking for access permissions before a SOQL/SOSL/DML operation.
Since Apex runs in system mode not having proper permissions checks results in escalation of
privilege and may produce runtime errors. This check forces you to handle such scenarios.

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
        if (!Schema.sObjectType.Contact.fields.Name.isUpdateable()) {
            return null;
        }

        c.Status__c = status;
        update c;
        return c;
    }
}
```
