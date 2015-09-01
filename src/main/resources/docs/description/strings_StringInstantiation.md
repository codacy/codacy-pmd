Avoid instantiating String objects; this is usually unnecessary since they are immutable and can be safely shared.

Ex:

private String bar = new String("bar"); // just do a String bar = "bar";

[SOURCE](https://pmd.github.io/pmd-5.3.3/pmd-java/rules/java/strings.html#StringInstantiation)
