//#Patterns: naming_LongVariable

public class Something {
    int reallyLongIntName = -3;            // VIOLATION - Field

    public static void main(String argumentsList[]) { // VIOLATION - Formal
        //#Info: naming_LongVariable
        int otherReallyLongName = -5;        // VIOLATION - Local
        //#Info: naming_LongVariable
        for (int interestingIntIndex = 0;    // VIOLATION - For
             interestingIntIndex < 10;
             interestingIntIndex++) {
        }
    }
}