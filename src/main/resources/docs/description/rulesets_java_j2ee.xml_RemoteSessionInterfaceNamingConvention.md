A Remote Home interface type of a Session EJB should be suffixed by ‘Home’.

Ex:


public interface MyBeautifulHome extends javax.ejb.EJBHome {}		// proper name

public interface MissingProperSuffix extends javax.ejb.EJBHome {}	// non-standard name
            

[SOURCE](https://pmd.github.io/pmd-5.3.3/pmd-java/rules/java/j2ee.html#RemoteSessionInterfaceNamingConvention)
