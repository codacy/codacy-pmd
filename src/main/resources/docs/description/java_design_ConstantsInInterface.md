Since: PMD 5.5

Avoid constants in interfaces. Interfaces should define types, constants are implementation details
better placed in classes or enums. See Effective Java, item 19.

Example(s):
```
public interface ConstantInterface {
    public static final int CONST1 = 1; // violation, no fields allowed in interface!
    static final int CONST2 = 1; // violation, no fields allowed in interface!
    final int CONST3 = 1; // violation, no fields allowed in interface!
    int CONST4 = 1; // violation, no fields allowed in interface!
}

// with ignoreIfHasMethods = false
public interface AnotherConstantInterface {
    public static final int CONST1 = 1; // violation, no fields allowed in interface!

    int anyMethod();
}

// with ignoreIfHasMethods = true
public interface YetAnotherConstantInterface {
    public static final int CONST1 = 1; // no violation

    int anyMethod();
}
```
