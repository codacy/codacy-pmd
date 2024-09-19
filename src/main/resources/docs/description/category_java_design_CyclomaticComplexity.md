Since: PMD 1.03

The complexity of methods directly affects maintenance costs and readability. Concentrating too much decisional logic
in a single method makes its behaviour hard to read and change.

Cyclomatic complexity assesses the complexity of a method by counting the number of decision points in a method,
plus one for the method entry. Decision points are places where the control flow jumps to another place in the
program. As such, they include all control flow statements, such as `if`, `while`, `for`, and `case`. For more
details on the calculation, see the documentation of the [Cyclo metric](pmd_java_metrics_index.html#cyclomatic-complexity-cyclo).

Generally, numbers ranging from 1-4 denote low complexity, 5-7 denote moderate complexity, 8-10 denote
high complexity, and 11+ is very high complexity. By default, this rule reports methods with a complexity &gt;= 10.
Additionally, classes with many methods of moderate complexity get reported as well once the total of their
methods' complexities reaches 80, even if none of the methods was directly reported.

Reported methods should be broken down into several smaller methods. Reported classes should probably be broken down
into subcomponents.

Example(s):
```
class Foo {
  void baseCyclo() {                // Cyclo = 1
    highCyclo();
  }

  void highCyclo() {                // Cyclo = 10: reported!
    int x = 0, y = 2;
    boolean a = false, b = true;

    if (a && (y == 1 ? b : true)) { // +3
      if (y == x) {                 // +1
        while (true) {              // +1
          if (x++ < 20) {           // +1
            break;                  // +1
          }
        }
      } else if (y == t && !d) {    // +2
        x = a ? y : x;              // +1
      } else {
        x = 2;
      }
    }
  }
}
```
