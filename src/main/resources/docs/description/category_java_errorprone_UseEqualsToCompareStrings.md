Since: PMD 4.1

Using '==' or '!=' to compare strings is only reliable if the interned string (`String#intern()`)
is used on both sides.

Use the `equals()` method instead.

Example(s):
```
public boolean test(String s) {
    if (s == "one") return true;        // unreliable
    if ("two".equals(s)) return true;   // better
    return false;
}
```
