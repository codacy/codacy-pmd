Since: PMD 4.1

Methods such as `getDeclaredConstructors()`, `getDeclaredMethods()`, and `getDeclaredFields()` also
return private constructors, methods and fields. These can be made accessible by calling `setAccessible(true)`.
This gives access to normally protected data which violates the principle of encapsulation.

This rule detects calls to `setAccessible` and finds possible accessibility alterations.
If the call to `setAccessible` is wrapped within a `PrivilegedAction`, then the access alteration
is assumed to be deliberate and is not reported.

Note that with Java 17 the Security Manager, which is used for `PrivilegedAction` execution,
is deprecated: [JEP 411: Deprecate the Security Manager for Removal](https://openjdk.org/jeps/411).
For future-proof code, deliberate access alteration should be suppressed using the usual
suppression methods (e.g. by using `@SuppressWarnings` annotation).

Example(s):
```
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.AccessController;
import java.security.PrivilegedAction;

public class Violation {
    private void invalidSetAccessCalls() throws NoSuchMethodException, SecurityException {
        Constructor<?> constructor = this.getClass().getDeclaredConstructor(String.class);
        // call to forbidden setAccessible
        constructor.setAccessible(true);

        Method privateMethod = this.getClass().getDeclaredMethod("aPrivateMethod");
        // call to forbidden setAccessible
        privateMethod.setAccessible(true);

        // deliberate accessibility alteration
        String privateField = AccessController.doPrivileged(new PrivilegedAction<String>() {
            @Override
            public String run() {
                try {
                    Field field = Violation.class.getDeclaredField("aPrivateField");
                    field.setAccessible(true);
                    return (String) field.get(null);
                } catch (ReflectiveOperationException | SecurityException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }
}
```
