Since: PMD 5.5.0

Avoid DML statements inside loops to avoid hitting the DML governor limit. Instead, try to batch up the data into a list and invoke your DML once on that list of data outside the loop.

Example(s):
```
public class Something {
    public void foo() {
        for (Integer i = 0; i < 151; i++) {
            Account account;
            // ...
            insert account;
        }
    }
}
```
