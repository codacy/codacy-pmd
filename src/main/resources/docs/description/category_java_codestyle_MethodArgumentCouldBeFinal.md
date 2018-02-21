Since: PMD 2.2

A method argument that is never re-assigned within the method can be declared final.

Example(s):
```
public void foo1 (String param) {       // do stuff with param never assigning it

}

public void foo2 (final String param) { // better, do stuff with param never assigning it

}
```
