Since: PMD 6.11.0

Use the diamond operator to let the type be inferred automatically. With the Diamond operator it is possible
to avoid duplication of the type parameters.
Instead, the compiler is now able to infer the parameter types for constructor calls,
which makes the code also more readable.

Example(s):
```
List<String> strings = new ArrayList<String>(); // unnecessary duplication of type parameters
List<String> stringsWithDiamond = new ArrayList<>(); // using the diamond operator is more concise
```
