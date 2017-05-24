Since: PMD 4.1

Always check the return values of navigation methods (next, previous, first, last) of a ResultSet.
If the value return is 'false', it should be handled properly.

Example(s):
```
Statement stat = conn.createStatement();
ResultSet rst = stat.executeQuery("SELECT name FROM person");
rst.next(); 	// what if it returns false? bad form
String firstName = rst.getString(1);

Statement stat = conn.createStatement();
ResultSet rst = stat.executeQuery("SELECT name FROM person");
if (rst.next()) {	// result is properly examined and used
    String firstName = rst.getString(1);
	} else  {
		// handle missing data
}
```
