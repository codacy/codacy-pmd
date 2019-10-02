Since: PMD 1.2.2

Ensure that resources (like `java.sql.Connection`, `java.sql.Statement`, and `java.sql.ResultSet` objects
and any subtype of `java.lang.AutoCloseable`) are always closed after use.
Failing to do so might result in resource leaks.

Note: It suffices to configure the super type, e.g. `java.lang.AutoClosable`, so that this rule automatically triggers
on any subtype (e.g. `java.io.FileInputStream`). Additionally specifying `java.sql.Connection` helps in detecting
the types, if the type resolution / auxclasspath is not correctly setup.

Note: Since PMD 6.16.0 the default value for the property `types` contains `java.lang.AutoCloseable` and detects
now cases where the standard `java.io.*Stream` classes are involved. In order to restore the old behaviour,
just remove &quot;AutoCloseable&quot; from the types.

Example(s):
```
public class Bar {
    public void withSQL() {
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

    public void withFile() {
        InputStream file = new FileInputStream(new File("/tmp/foo"));
        try {
            int c = file.in();
        } catch (IOException e) {
            // handle exception
        } finally {
            // TODO: close file
        }
    }
}
```
