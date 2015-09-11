The Local Home interface of a Session EJB should be suffixed by ‘LocalHome’.

Ex:

```
public interface MyBeautifulLocalHome extends javax.ejb.EJBLocalHome {
  // proper name
}

public interface MissingProperSuffix extends javax.ejb.EJBLocalHome {
  // non-standard name
}
```

[Source](https://pmd.github.io/pmd-5.3.3/pmd-java/rules/java/j2ee.html#LocalHomeNamingConvention)
