//#Patterns: java_basic_CheckResultSet

public class Foo {

    public void bar() {
        Statement stat = conn.createStatement();
        //#Warn: java_basic_CheckResultSet
        ResultSet rst = stat.executeQuery("SELECT name FROM person");
        rst.next(); 	// what if it returns false? bad form
        String firstName = rst.getString(1);

        Statement stat2 = conn.createStatement();
        ResultSet rst2 = stat2.executeQuery("SELECT name FROM person");
        if (rst2.next()) {	// result is properly examined and used
            String firstName2 = rst2.getString(1);
        } else  {
            // handle missing data
        }
    }
}


