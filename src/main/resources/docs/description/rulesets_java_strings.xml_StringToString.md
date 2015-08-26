Avoid calling toString() on objects already known to be string instances; this is unnecessary.

Ex:

private String baz() {
    String bar = "howdy";
    return bar.toString();
}

[SOURCE](https://pmd.github.io/pmd-5.3.3/pmd-java/rules/java/strings.html#StringToString)
