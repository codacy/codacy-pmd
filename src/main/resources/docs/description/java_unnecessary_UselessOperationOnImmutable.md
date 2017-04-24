Since: PMD 3.5

An operation on an Immutable object (String, BigDecimal or BigInteger) won't change the object itself
since the result of the operation is a new object. Therefore, ignoring the operation result is an error.

Example(s):
```
import java.math.*;

class Test {
  void method1() {
    BigDecimal bd=new BigDecimal(10);
    bd.add(new BigDecimal(5)); 		// this will trigger the rule
  }
  void method2() {
    BigDecimal bd=new BigDecimal(10);
    bd = bd.add(new BigDecimal(5)); // this won't trigger the rule
  }
}
```
