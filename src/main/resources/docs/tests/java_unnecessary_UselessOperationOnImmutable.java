//#Patterns: java_unnecessary_UselessOperationOnImmutable

import java.math.*;

public class Foo {
    public void bar() {
        BigDecimal bd = new BigDecimal(10);
        //#Warn: java_unnecessary_UselessOperationOnImmutable
        bd.add(new BigDecimal(5));

        bd = bd.add(new BigDecimal(5));
    }
}
