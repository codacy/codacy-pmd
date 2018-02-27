Since: PMD 1.2

Avoid instantiating Boolean objects; you can reference Boolean.TRUE, Boolean.FALSE, or call Boolean.valueOf() instead.
Note that new Boolean() is deprecated since JDK 9 for that reason.

Example(s):
```
Boolean bar = new Boolean("true");        // unnecessary creation, just reference Boolean.TRUE;
Boolean buz = Boolean.valueOf(false);    // ...., just reference Boolean.FALSE;
```
