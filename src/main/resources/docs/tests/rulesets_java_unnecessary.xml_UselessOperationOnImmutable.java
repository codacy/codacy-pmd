//#Patterns: unnecessary_UselessOperationOnImmutable

import java.math.*;

public class Foo {
    public void bar() {
        BigDecimal bd = new BigDecimal(10);
        //#Err: unnecessary_UselessOperationOnImmutable
        bd.add(new BigDecimal(5));

        bd = bd.add(new BigDecimal(5));
    }
}
