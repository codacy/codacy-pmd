String.trim().length() is an inefficient way to check if a String is really empty, as it creates a new String object just to check its size. Consider creating a static function that loops through a string, checking Character.isWhitespace() on each character and returning false if a non-whitespace character is found.

Ex:

public void bar(String string) {
	if (string != null && string.trim().size() > 0) {
		doSomething();
	}
}

[SOURCE](https://pmd.github.io/pmd-5.3.3/pmd-java/rules/java/strings.html#InefficientEmptyStringCheck)
