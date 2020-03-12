Since: PMD 5.5.3

The rule validates you are checking for access permissions before a SOQL/SOSL/DML operation.
Since Apex runs in system mode not having proper permissions checks results in escalation of
privilege and may produce runtime errors. This check forces you to handle such scenarios.

Example(s):
```
public class Foo {
    public Contact foo(String status, String ID) {
        Contact c = [SELECT Status__c FROM Contact WHERE Id=:ID];

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
