Since: PMD 1.0

Code containing duplicate String literals can usually be improved by declaring the String as a constant field.

Example(s):
```
private void bar() {
     buz("Howdy");
     buz("Howdy");
     buz("Howdy");
     buz("Howdy");
}
private void buz(String x) {}
```
