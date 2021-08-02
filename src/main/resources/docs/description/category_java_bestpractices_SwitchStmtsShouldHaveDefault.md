Since: PMD 1.0

Switch statements should be exhaustive, to make their control flow
            easier to follow. This can be achieved by adding a `default` case, or,
            if the switch is on an enum type, by ensuring there is one switch branch
            for each enum constant.

Example(s):
```
class Foo {{
    int x = 2;
    switch (x) {
      case 1: int j = 6;
      case 2: int j = 8;
      // missing default: here
    }
}}
```
