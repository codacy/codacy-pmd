Since: PMD 4.2.6

Avoid catching generic exceptions such as NullPointerException, RuntimeException, Exception in try-catch block

Example(s):
```
package com.igate.primitive;

public class PrimitiveType {

    public void downCastPrimitiveType() {
        try {
            System.out.println(" i [" + i + "]");
        } catch(Exception e) {
            e.printStackTrace();
        } catch(RuntimeException e) {
            e.printStackTrace();
        } catch(NullPointerException e) {
            e.printStackTrace();
        }
    }
}
```
