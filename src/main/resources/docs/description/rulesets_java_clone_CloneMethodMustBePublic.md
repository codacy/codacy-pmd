Since: PMD 5.4.0

The java Manual says &quot;By convention, classes that implement this interface should override
Object.clone (which is protected) with a public method.&quot;

Example(s):
```
public class Foo implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException { // Violation, must be public
    }
}

public class Foo implements Cloneable {
    @Override
    protected Foo clone() { // Violation, must be public
    }
}

public class Foo implements Cloneable {
    @Override
    public Object clone() // Ok
}
```
