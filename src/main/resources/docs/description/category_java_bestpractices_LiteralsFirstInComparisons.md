Since: PMD 6.24.0

Position literals first in all String comparisons, if the second argument is null then NullPointerExceptions
            can be avoided, they will just return false. Note that switching literal positions for compareTo and
            compareToIgnoreCase may change the result, see examples.

Example(s):
```
class Foo {
    boolean bar(String x) {
        return x.equals("2"); // should be "2".equals(x)
    }
    boolean bar(String x) {
        return x.equalsIgnoreCase("2"); // should be "2".equalsIgnoreCase(x)
    }
    boolean bar(String x) {
        return (x.compareTo("bar") > 0); // should be: "bar".compareTo(x) < 0
    }
    boolean bar(String x) {
        return (x.compareToIgnoreCase("bar") > 0); // should be: "bar".compareToIgnoreCase(x) < 0
    }
    boolean bar(String x) {
        return x.contentEquals("bar"); // should be "bar".contentEquals(x)
    }
}
```
