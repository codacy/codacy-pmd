//#Patterns: rulesets_java_strictexception.xml_AvoidCatchingGenericException

package com.igate.primitive;

public class PrimitiveType {
    public void downCastPrimitiveType() {
        try {
            System.out.println(" i [" + i + "]");
            //#Warn: rulesets_java_strictexception.xml_AvoidCatchingGenericException
        } catch(Exception e) {
            e.printStackTrace();
            //#Warn: rulesets_java_strictexception.xml_AvoidCatchingGenericException
        } catch(RuntimeException e) {
            e.printStackTrace();
            //#Warn: rulesets_java_strictexception.xml_AvoidCatchingGenericException
        } catch(NullPointerException e) {
            e.printStackTrace();
        }
    }
}

