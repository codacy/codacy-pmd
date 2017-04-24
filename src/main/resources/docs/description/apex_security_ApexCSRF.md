Since: PMD 5.5.3

Check to avoid making DML operations in Apex class constructor/init method. This prevents
modification of the database just by accessing a page.

Example(s):
```
public class Foo {
    public init() {
        insert data;
    }

    public Foo() {
        insert data;
    }
}
```
