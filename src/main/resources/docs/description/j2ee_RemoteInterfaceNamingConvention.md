Remote Interface of a Session EJB should not have a suffix.

Ex:

```
/* Poor Session suffix */
public interface BadSuffixSession extends javax.ejb.EJBObject {}

/* Poor EJB suffix */
public interface BadSuffixEJB extends javax.ejb.EJBObject {}

/* Poor Bean suffix */
public interface BadSuffixBean extends javax.ejb.EJBObject {}
```            

[Source](https://pmd.github.io/pmd-5.3.3/pmd-java/rules/java/j2ee.html#RemoteInterfaceNamingConvention)
