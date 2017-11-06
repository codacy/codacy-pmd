Since: PMD 3.3

A logger should normally be defined private static final and be associated with the correct class.
Private final Log log; is also allowed for rare cases where loggers need to be passed around,
with the restriction that the logger needs to be passed into the constructor.

Example(s):
```
public class Foo {

    private static final Log LOG = LogFactory.getLog(Foo.class);    // proper way

    protected Log LOG = LogFactory.getLog(Testclass.class);         // wrong approach
}
```
