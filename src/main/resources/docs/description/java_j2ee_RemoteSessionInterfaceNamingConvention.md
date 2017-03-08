Since: PMD 4.0

A Remote Home interface type of a Session EJB should be suffixed by 'Home'.

Example(s):
```
public interface MyBeautifulHome extends javax.ejb.EJBHome {}		// proper name

public interface MissingProperSuffix extends javax.ejb.EJBHome {}	// non-standard name
```

[Source](https://pmd.github.io/pmd-5.5.4/pmd-java/rules/java/j2ee.html#RemoteSessionInterfaceNamingConvention)
