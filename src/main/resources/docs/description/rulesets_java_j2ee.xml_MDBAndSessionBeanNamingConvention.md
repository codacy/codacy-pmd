The EJB Specification states that any MessageDrivenBean or SessionBean should be suffixed by ‘Bean’.

Ex:


public class SomeBean implements SessionBean{}					// proper name

public class MissingTheProperSuffix implements SessionBean {}  	// non-standard name
                   
[SOURCE](https://pmd.github.io/pmd-5.3.3/pmd-java/rules/java/j2ee.html#MDBAndSessionBeanNamingConvention)
