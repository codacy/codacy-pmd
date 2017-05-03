Since: PMD 4.1

Unnecessary reliance on Java Native Interface (JNI) calls directly reduces application portability
and increases the maintenance burden.

Example(s):
```
public class SomeJNIClass {

     public SomeJNIClass() {
         System.loadLibrary("nativelib");
     }

     static {
         System.loadLibrary("nativelib");
         }

     public void invalidCallsInMethod() throws SecurityException, NoSuchMethodException {
         System.loadLibrary("nativelib");
     }
}
```

[Source](https://pmd.github.io/pmd-5.6.1/pmd-java/rules/java/controversial.html#AvoidUsingNativeCode)
