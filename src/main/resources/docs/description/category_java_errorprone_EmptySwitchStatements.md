Since: PMD 1.0

Empty switch statements serve no purpose and should be removed.

Example(s):
```
public void bar() {
    int x = 2;
    switch (x) {
        // once there was code here
        // but it's been commented out or something
    }
}
```
