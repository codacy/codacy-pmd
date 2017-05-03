Since: PMD 1.2.2

Ensure that resources (like Connection, Statement, and ResultSet objects) are always closed after use.

Example(s):
```
public class Bar {
  public void foo() {
    Connection c = pool.getConnection();
    try {
      // do stuff
    } catch (SQLException ex) {
     // handle exception
    } finally {
      // oops, should close the connection using 'close'!
      // c.close();
    }
  }
}
```

[Source](https://pmd.github.io/pmd-5.6.1/pmd-java/rules/java/design.html#CloseResource)
