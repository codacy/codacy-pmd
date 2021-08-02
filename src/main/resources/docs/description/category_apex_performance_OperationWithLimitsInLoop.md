Since: PMD 6.29.0

Database class methods, DML operations, SOQL queries, SOSL queries, Approval class methods, Email sending, async scheduling or queueing within loops can cause governor limit exceptions. Instead, try to batch up the data into a list and invoke the operation once on that list of data outside the loop.

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

    public void messageInsideOfLoop() {
        for (Integer i = 0; i < 10; i++) {
            Messaging.SingleEmailMessage email = new Messaging.SingleEmailMessage();
            Messaging.sendEmail(new Messaging.SingleEmailMessage[]{email});
        }
    }

    public void approvalInsideOfLoop(Account[] accs) {
        for (Integer i = 0; i < 10; i++) {
            Account acc = accs[i];
            Approval.ProcessSubmitRequest req = new Approval.ProcessSubmitRequest();
            req.setObjectId(acc.Id);
            Approval.process(req);
            Approval.lock(acc);
            Approval.unlock(acc);
        }
    }

    public void asyncInsideOfLoop() {
        for (Integer i = 0; i < 10; i++) {
            System.enqueueJob(new MyQueueable());
            System.schedule('x', '0 0 0 1 1 ?', new MySchedule());
            System.scheduleBatch(new MyBatch(), 'x', 1);
        }
    }
}
```
