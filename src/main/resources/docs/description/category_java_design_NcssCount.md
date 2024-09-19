Since: PMD 6.0.0

This rule uses the NCSS (Non-Commenting Source Statements) metric to determine the number of lines
of code in a class, method or constructor. NCSS ignores comments, blank lines, and only counts actual
statements. For more details on the calculation, see the documentation of
the [NCSS metric](pmd_java_metrics_index.html#non-commenting-source-statements-ncss).

Example(s):
```
import java.util.Collections;       // +0
import java.io.IOException;         // +0

class Foo {                         // +1, total Ncss = 12

  public void bigMethod()           // +1
      throws IOException {
    int x = 0, y = 2;               // +1
    boolean a = false, b = true;    // +1

    if (a || b) {                   // +1
      try {                         // +1
        do {                        // +1
          x += 2;                   // +1
        } while (x < 12);

        System.exit(0);             // +1
      } catch (IOException ioe) {   // +1
        throw new PatheticFailException(ioe); // +1
      }
    } else {
      assert false;                 // +1
    }
  }
}
```
