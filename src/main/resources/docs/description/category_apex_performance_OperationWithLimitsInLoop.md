Since: PMD 6.29.0

Database class methods, DML operations, SOQL queries, or SOSL queries within loops can cause governor limit exceptions. Instead, try to batch up the data into a list and invoke the operation once on that list of data outside the loop.

Example(s):
```
public class Something {
    public void databaseMethodInsideOfLoop(List<Account> accounts) {
        for (Account a : accounts) {
            Database.insert(a);
        }
    }

    public void dmlInsideOfLoop() {
        for (Integer i = 0; i < 151; i++) {
            Account account;
            // ...
            insert account;
        }
    }

    public void soqlInsideOfLoop() {
        for (Integer i = 0; i < 10; i++) {
            List<Account> accounts = [SELECT Id FROM Account];
        }
    }

    public void soslInsideOfLoop() {
        for (Integer i = 0; i < 10; i++) {
            List<List<SObject>> searchList = [FIND 'map*' IN ALL FIELDS RETURNING Account (Id, Name), Contact, Opportunity, Lead];
        }
    }
}
```
