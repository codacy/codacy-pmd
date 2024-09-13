Since: PMD 5.5

Using constants in interfaces is a bad practice. Interfaces define types, constants are implementation details better placed in classes or enums. If the constants are best viewed as members of an enumerated type, you should export them with an enum type.
For other scenarios, consider using a utility class. See Effective Java's 'Use interfaces only to define types'.

Example(s):
```
public interface ConstantInterface {
    public static final int CONST1 = 1; // violation, no fields allowed in interface!
    static final int CONST2 = 1;        // violation, no fields allowed in interface!
    final int CONST3 = 1;               // violation, no fields allowed in interface!
    int CONST4 = 1;                     // violation, no fields allowed in interface!
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
