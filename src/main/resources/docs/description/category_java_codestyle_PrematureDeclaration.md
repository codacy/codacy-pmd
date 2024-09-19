Since: PMD 5.0

Checks for variables that are defined before they might be used. A reference is deemed to be premature if it is created right before a block of code that doesn't use it that also has the ability to return or throw an exception.

Example(s):
```
public int getLength(String[] strings) {

    int length = 0; // declared prematurely

    if (strings == null || strings.length == 0) return 0;

    for (String str : strings) {
        length += str.length();
    }

    return length;
}
```
