Consecutively calling StringBuffer/StringBuilder.append with String literals

Ex:

StringBuffer buf = new StringBuffer();
buf.append("Hello").append(" ").append("World"); // poor
buf.append("Hello World");        				 // good

[SOURCE](https://pmd.github.io/pmd-5.3.3/pmd-java/rules/java/strings.html#ConsecutiveLiteralAppends)
