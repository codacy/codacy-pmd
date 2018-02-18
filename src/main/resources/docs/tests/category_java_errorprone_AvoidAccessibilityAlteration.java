//#Patterns: category_java_errorprone_AvoidAccessibilityAlteration

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.security.PrivilegedAction;

public class Violation {
    public void invalidCallsInMethod() throws SecurityException, NoSuchMethodException {

            // Possible call to forbidden getDeclaredConstructors
            Class[] arrayOfClass = new Class[1];
            //#Warn: category_java_errorprone_AvoidAccessibilityAlteration
            this.getClass().getDeclaredConstructors();
            //#Warn: category_java_errorprone_AvoidAccessibilityAlteration
            this.getClass().getDeclaredConstructor(arrayOfClass);
            Class clazz = this.getClass();
            //#Warn: category_java_errorprone_AvoidAccessibilityAlteration
            clazz.getDeclaredConstructor(arrayOfClass);
            //#Warn: category_java_errorprone_AvoidAccessibilityAlteration
            clazz.getDeclaredConstructors();

            //#Warn: category_java_errorprone_AvoidAccessibilityAlteration
            clazz.getMethod("", arrayOfClass).setAccessible(false);
            //#Warn: category_java_errorprone_AvoidAccessibilityAlteration
            AccessibleObject.setAccessible(null, false);
            Method.setAccessible(null, false);
            Method[] methodsArray = clazz.getMethods();
            int nbMethod;

            for ( nbMethod = 0; nbMethod < methodsArray.length; nbMethod++  ) {
                //#Warn: category_java_errorprone_AvoidAccessibilityAlteration
                methodsArray[nbMethod].setAccessible(false);
            }
            
            // Possible call to forbidden PrivilegedAction
            PrivilegedAction priv = (PrivilegedAction) new Object(); priv.run();
    }
}
