Using ‘==’ or ‘!=’ to compare strings only works if intern version is used on both sides. Use the equals() method instead.

Ex:

public boolean test(String s) {
    if (s == "one") return true; 		// unreliable
    if ("two".equals(s)) return true; 	// better
    return false;
}

[SOURCE](https://pmd.github.io/pmd-5.3.3/pmd-java/rules/java/strings.html#UseEqualsToCompareStrings)
