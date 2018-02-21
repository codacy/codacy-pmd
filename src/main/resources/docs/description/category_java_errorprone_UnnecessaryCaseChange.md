Since: PMD 3.3

Using equalsIgnoreCase() is faster than using toUpperCase/toLowerCase().equals()

Example(s):
```
boolean answer1 = buz.toUpperCase().equals("baz");              // should be buz.equalsIgnoreCase("baz")

boolean answer2 = buz.toUpperCase().equalsIgnoreCase("baz");    // another unnecessary toUpperCase()
```
