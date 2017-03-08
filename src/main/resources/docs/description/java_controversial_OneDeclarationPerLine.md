Since: PMD 5.0

Java allows the use of several variables declaration of the same type on one line. However, it
can lead to quite messy code. This rule looks for several declarations on the same line.

Example(s):
```
String name;            // separate declarations
String lastname;

String name, lastname;  // combined declaration, a violation

String name,
       lastname;        // combined declaration on multiple lines, no violation by default.
                        // Set property strictMode to true to mark this as violation.
```

[Source](https://pmd.github.io/pmd-5.5.4/pmd-java/rules/java/controversial.html#OneDeclarationPerLine)
