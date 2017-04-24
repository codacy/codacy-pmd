Since: PMD 3.2

Avoid printStackTrace(); use a logger call instead.

Example(s):
```
class Foo {
  void bar() {
    try {
     // do something
    } catch (Exception e) {
     e.printStackTrace();
     }
   }
}
```
