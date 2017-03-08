Since: PMD 2.2

Exposing internal arrays to the caller violates object encapsulation since elements can be 
removed or replaced outside of the object that owns it. It is safer to return a copy of the array.

Example(s):
```
public class SecureSystem {
  UserData [] ud;
  public UserData [] getUserData() {
      // Don't return directly the internal array, return a copy
      return ud;
  }
}
```

[Source](https://pmd.github.io/pmd-5.5.4/pmd-java/rules/java/sunsecure.html#MethodReturnsInternalArray)
