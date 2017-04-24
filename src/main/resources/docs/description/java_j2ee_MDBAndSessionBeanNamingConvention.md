Since: PMD 4.0

The EJB Specification states that any MessageDrivenBean or SessionBean should be suffixed by 'Bean'.

Example(s):
```
public class SomeBean implements SessionBean{}					// proper name

public class MissingTheProperSuffix implements SessionBean {}  	// non-standard name
```
