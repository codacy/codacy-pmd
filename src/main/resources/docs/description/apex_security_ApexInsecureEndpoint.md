Since: PMD 5.5.3

Checks against accessing endpoints under plain **http**. You should always use
**https** for security.

Example(s):
```
public without sharing class Foo {
    void foo() {
        HttpRequest req = new HttpRequest();
        req.setEndpoint('http://localhost:com');
    }
}
```
