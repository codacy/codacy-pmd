Since: PMD 5.0

Use opposite operator instead of negating the whole expression with a logic complement operator.

Example(s):
```
public boolean bar(int a, int b) {

    if (!(a == b)) { // use !=
         return false;
     }

    if (!(a < b)) { // use >=
         return false;
    }

    return true;
}
```
