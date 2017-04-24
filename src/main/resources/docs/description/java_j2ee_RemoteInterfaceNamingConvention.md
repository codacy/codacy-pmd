Since: PMD 4.0

Remote Interface of a Session EJB should not have a suffix.

Example(s):
```
/* Poor Session suffix */
 public interface BadSuffixSession extends javax.ejb.EJBObject {}

 /* Poor EJB suffix */
 public interface BadSuffixEJB extends javax.ejb.EJBObject {}

 /* Poor Bean suffix */
 public interface BadSuffixBean extends javax.ejb.EJBObject {}
```
