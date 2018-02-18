//#Patterns: category_java_codestyle_LongVariable

public class Something {
    int reallyLongIntName = -3;            // VIOLATION - Field

    public static void main(String argumentsList[]) { // VIOLATION - Formal
        //#Warn: category_java_codestyle_LongVariable
        int otherReallyLongName = -5;        // VIOLATION - Local
        //#Warn: category_java_codestyle_LongVariable
        for (int interestingIntIndex = 0;    // VIOLATION - For
             interestingIntIndex < 10;
             interestingIntIndex++) {
        }
    }
}
