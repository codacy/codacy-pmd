Since: PMD 4.0

The Local Home interface of a Session EJB should be suffixed by 'LocalHome'.

Example(s):
```
public interface MyBeautifulLocalHome extends javax.ejb.EJBLocalHome {}// proper name

 public interface MissingProperSuffix extends javax.ejb.EJBLocalHome {}	// non-standard name
```

[Source](https://pmd.github.io/pmd-5.5.4/pmd-java/rules/java/j2ee.html#LocalHomeNamingConvention)
