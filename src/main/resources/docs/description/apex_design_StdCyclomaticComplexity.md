Since: PMD 5.5.0

Complexity directly affects maintenance costs is determined by the number of decision points in a method 
plus one for the method entry.  The decision points include 'if', 'while', 'for', and 'case labels' calls.  
Generally, numbers ranging from 1-4 denote low complexity, 5-7 denote moderate complexity, 8-10 denote
high complexity, and 11+ is very high complexity.

Example(s):
```
// This has a Cyclomatic Complexity = 12
public class Foo {
1   public void example() {
2   if (a == b || (c == d && e == f)) {
3       if (a1 == b1) {
            fiddle();
4       } else if a2 == b2) {
            fiddle();
        }  else {
            fiddle();
        }
5   } else if (c == d) {
6       while (c == d) {
            fiddle();
        }
7   } else if (e == f) {
8       for (int n = 0; n < h; n++) {
            fiddle();
        }
    } else {
        switch (z) {
9           case 1:
                fiddle();
                break;
10          case 2:
                fiddle();
                break;
11          case 3:
                fiddle();
                break;
12          default:
                fiddle();
                break;
        }
    }
}
```
