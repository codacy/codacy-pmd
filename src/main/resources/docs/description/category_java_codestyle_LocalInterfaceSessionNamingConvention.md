Since: PMD 4.0

The Local Interface of a Session EJB should be suffixed by 'Local'.

Example(s):
```
public interface MyLocal extends javax.ejb.EJBLocalObject {}                // proper name

public interface MissingProperSuffix extends javax.ejb.EJBLocalObject {}    // non-standard name
```
