Since: PMD 6.0.0

The complexity of methods directly affects maintenance costs and readability. Concentrating too much decisional logic
in a single method makes its behaviour hard to read and change.

Cyclomatic complexity assesses the complexity of a method by counting the number of decision points in a method,
plus one for the method entry. Decision points are places where the control flow jumps to another place in the
program. As such, they include all control flow statements, such as 'if', 'while', 'for', and 'case'.

Generally, numbers ranging from 1-4 denote low complexity, 5-7 denote moderate complexity, 8-10 denote
high complexity, and 11+ is very high complexity. By default, this rule reports methods with a complexity &gt;= 10.
Additionally, classes with many methods of moderate complexity get reported as well once the total of their
methods' complexities reaches 40, even if none of the methods was directly reported.

Reported methods should be broken down into several smaller methods. Reported classes should probably be broken down
into subcomponents.

Example(s):
```
public class Complicated {
  public void example() { // This method has a cyclomatic complexity of 12
    int x = 0, y = 1, z = 2, t = 2;
    boolean a = false, b = true, c = false, d = true;
    if (a && b || b && d) {
      if (y == z) {
        x = 2;
      } else if (y == t && !d) {
        x = 2;
      } else {
        x = 2;
      }
    } else if (c && d) {
      while (z < y) {
        x = 2;
      }
    } else {
      for (int n = 0; n < t; n++) {
        x = 2;
      }
    }
  }
}
```
