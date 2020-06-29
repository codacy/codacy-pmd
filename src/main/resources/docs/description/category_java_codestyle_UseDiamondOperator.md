Since: PMD 6.11.0

Use the diamond operator to let the type be inferred automatically. With the Diamond operator it is possible
to avoid duplication of the type parameters.
Instead, the compiler is now able to infer the parameter types for constructor calls,
which makes the code also more readable.

The diamond operator has been introduced with java 7. However, type inference has been improved further
with java8, rendering more type parameters unnecessary. This is only possible with java8 and the resulting
code won't compile with java7. If you use java7, make sure to enable `java7Compatibility` for this rule to avoid
false positives.

Example(s):
```
List<String> strings = new ArrayList<String>(); // unnecessary duplication of type parameters
List<String> stringsWithDiamond = new ArrayList<>(); // using the diamond operator is more concise
```
