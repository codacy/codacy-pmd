Unnecessary reliance on Java Native Interface (JNI) calls directly reduces application portability and increases the maintenance burden.

Ex:

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

[Source](http://pmd.sourceforge.net/pmd-5.3.2/pmd-java/rules/java/controversial.html#AvoidUsingNativeCode)
