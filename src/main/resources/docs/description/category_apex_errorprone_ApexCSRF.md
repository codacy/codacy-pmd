Since: PMD 5.5.3

Having DML operations in Apex class constructor or initializers can have unexpected side effects:
By just accessing a page, the DML statements would be executed and the database would be modified.
Just querying the database is permitted.

In addition to constructors and initializers, any method called `init` is checked as well.

Salesforce Apex already protects against this scenario and raises a runtime exception.

Note: This rule has been moved from category &quot;Security&quot; to &quot;Error Prone&quot; with PMD 6.21.0, since
using DML in constructors is not a security problem, but crashes the application.

Example(s):
```
public class Foo {
    // initializer
    {
        insert data;
    }

    // static initializer
    static {
        insert data;
    }

    // constructor
    public Foo() {
        insert data;
    }
}
```
