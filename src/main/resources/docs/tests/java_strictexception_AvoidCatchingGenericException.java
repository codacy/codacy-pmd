//#Patterns: java_strictexception_AvoidCatchingGenericException

package com.igate.primitive;

public class PrimitiveType {
    public void downCastPrimitiveType() {
        try {
            System.out.println(" i [" + i + "]");
            //#Warn: java_strictexception_AvoidCatchingGenericException
        } catch(Exception e) {
            e.printStackTrace();
            //#Warn: java_strictexception_AvoidCatchingGenericException
        } catch(RuntimeException e) {
            e.printStackTrace();
            //#Warn: java_strictexception_AvoidCatchingGenericException
        } catch(NullPointerException e) {
            e.printStackTrace();
        }
    }
}

