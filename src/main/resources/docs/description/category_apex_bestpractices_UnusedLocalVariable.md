Since: PMD 6.23.0

Detects when a local variable is declared and/or assigned but not used.

Example(s):
```
public Boolean bar(String z) {
        String x = 'some string'; // not used

        String y = 'some other string'; // used in the next line
        return z.equals(y);
    }
```
