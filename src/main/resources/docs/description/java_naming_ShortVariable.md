Since: PMD 0.3

Fields, local variables, or parameter names that are very short are not helpful to the reader.

Example(s):
```
public class Something {
    private int q = 15;                         // field - too short
    public static void main( String as[] ) {    // formal arg - too short
        int r = 20 + q;                         // local var - too short
        for (int i = 0; i < 10; i++) {          // not a violation (inside 'for' loop)
            r += q;
        }
        for (Integer i : numbers) {             // not a violation (inside 'for-each' loop)
            r += q;
        }
    }
}
```

[Source](https://pmd.github.io/pmd-5.5.4/pmd-java/rules/java/naming.html#ShortVariable)
