Using `equalsIgnoreCase()` is faster than using `toUpperCase`/`toLowerCase().equals()`

Ex:

```
boolean answer1 = buz.toUpperCase().equals("baz");	 		// should be buz.equalsIgnoreCase("baz")

boolean answer2 = buz.toUpperCase().equalsIgnoreCase("baz");	 // another unnecessary toUpperCase()
```

[Source](https://pmd.github.io/pmd-5.3.3/pmd-java/rules/java/strings.html#UnnecessaryCaseChange)
