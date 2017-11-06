Since: PMD 4.0

The Local Home interface of a Session EJB should be suffixed by 'LocalHome'.

Example(s):
```
public interface MyBeautifulLocalHome extends javax.ejb.EJBLocalHome {} // proper name

public interface MissingProperSuffix extends javax.ejb.EJBLocalHome {}  // non-standard name
```
