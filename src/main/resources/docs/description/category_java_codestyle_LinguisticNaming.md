Since: PMD 6.7.0

This rule finds Linguistic Naming Antipatterns. It checks for fields, that are named, as if they should
            be boolean but have a different type. It also checks for methods, that according to their name, should
            return a boolean, but don't. Further, it checks, that getters return something and setters won't.
            Finally, it checks that methods, that start with &quot;to&quot; - so called transform methods - actually return
            something, since according to their name, they should convert or transform one object into another.
            There is additionally an option, to check for methods that contain &quot;To&quot; in their name - which are
            also transform methods. However, this is disabled by default, since this detection is prone to
            false positives.

            For more information, see [Linguistic Antipatterns - What They Are and How
Developers Perceive Them](https://doi.org/10.1007/s10664-014-9350-8).

Example(s):
```
public class LinguisticNaming {
    int isValid;    // the field name indicates a boolean, but it is an int.
    boolean isTrue; // correct type of the field

    void myMethod() {
        int hasMoneyLocal;      // the local variable name indicates a boolean, but it is an int.
        boolean hasSalaryLocal; // correct naming and type
    }

    // the name of the method indicates, it is a boolean, but the method returns an int.
    int isValid() {
        return 1;
    }
    // correct naming and return type
    boolean isSmall() {
        return true;
    }

    // the name indicates, this is a setter, but it returns something
    int setName() {
        return 1;
    }

    // the name indicates, this is a getter, but it doesn't return anything
    void getName() {
        // nothing to return?
    }

    // the name indicates, it transforms an object and should return the result
    void toDataType() {
        // nothing to return?
    }
    // the name indicates, it transforms an object and should return the result
    void grapeToWine() {
        // nothing to return?
    }
}
```
