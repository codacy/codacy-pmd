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

[Source](https://pmd.github.io/pmd-5.6.1/pmd-java/rules/java/logging-java.html#AvoidPrintStackTrace)
