Since: PMD 3.3

Using equalsIgnoreCase() is faster than using toUpperCase/toLowerCase().equals()

Example(s):
```
boolean answer1 = buz.toUpperCase().equals("BAZ");              // should be buz.equalsIgnoreCase("BAZ")

boolean answer2 = buz.toUpperCase().equalsIgnoreCase("BAZ");    // another unnecessary toUpperCase()
```
