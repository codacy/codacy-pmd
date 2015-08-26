The Local Interface of a Session EJB should be suffixed by ‘Local’.

Ex:

 
public interface MyLocal extends javax.ejb.EJBLocalObject {}				// proper name

public interface MissingProperSuffix extends javax.ejb.EJBLocalObject {}	// non-standard name           

[SOURCE](https://pmd.github.io/pmd-5.3.3/pmd-java/rules/java/j2ee.html#LocalInterfaceSessionNamingConvention)
