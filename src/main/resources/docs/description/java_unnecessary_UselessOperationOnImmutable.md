An operation on an Immutable object (`String`, `BigDecimal` or `BigInteger`) won’t change the object itself since the result of the operation is a new object. Therefore, ignoring the operation result is an error.

Ex:

```
import java.math.*;

class Test {
	void method1() {
		BigDecimal bd=new BigDecimal(10);
		bd.add(new BigDecimal(5)); // this will trigger the rule
	}  
}
```

[Source](http://pmd.sourceforge.net/pmd-5.3.2/pmd-java/rules/java/unnecessary.html#UselessOperationOnImmutable)
