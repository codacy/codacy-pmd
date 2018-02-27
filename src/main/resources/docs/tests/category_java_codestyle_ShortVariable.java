//#Patterns: category_java_codestyle_ShortVariable

public class Something {
    //#Info: category_java_codestyle_ShortVariable
    private int q = 15;                         // field - too short

    //#Info: category_java_codestyle_ShortVariable
    public static void main( String as[] ) {    // formal arg - too short

        //#Info: category_java_codestyle_ShortVariable
        int r = 20 + q;                         // local var - too short
        for (int i = 0; i < 10; i++) {          // not a violation (inside 'for' loop)
            r += q;
        }
        for (Integer i : numbers) {             // not a violation (inside 'for-each' loop)
            r += q;
        }
    }
}
