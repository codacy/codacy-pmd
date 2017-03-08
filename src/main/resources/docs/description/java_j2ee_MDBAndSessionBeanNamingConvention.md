Since: PMD 4.0

The EJB Specification states that any MessageDrivenBean or SessionBean should be suffixed by 'Bean'.

Example(s):
```
public class SomeBean implements SessionBean{}					// proper name

public class MissingTheProperSuffix implements SessionBean {}  	// non-standard name
```

[Source](https://pmd.github.io/pmd-5.5.4/pmd-java/rules/java/j2ee.html#MDBAndSessionBeanNamingConvention)
