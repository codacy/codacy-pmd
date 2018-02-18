//#Patterns: category_java_design_AvoidCatchingGenericException

package com.igate.primitive;

public class PrimitiveType {
    public void downCastPrimitiveType() {
        try {
            System.out.println(" i [" + i + "]");
            //#Warn: category_java_design_AvoidCatchingGenericException
        } catch(Exception e) {
            e.printStackTrace();
            //#Warn: category_java_design_AvoidCatchingGenericException
        } catch(RuntimeException e) {
            e.printStackTrace();
            //#Warn: category_java_design_AvoidCatchingGenericException
        } catch(NullPointerException e) {
            e.printStackTrace();
        }
    }
}

