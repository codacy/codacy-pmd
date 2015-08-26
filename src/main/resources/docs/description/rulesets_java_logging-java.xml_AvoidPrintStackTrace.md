Avoid printStackTrace(); use a logger call instead.

Ex:

class Foo {
  void bar() {
    try {
     // do something
    } catch (Exception e) {
     e.printStackTrace();
     }
   }
}

[SOURCE](https://pmd.github.io/pmd-5.3.3/pmd-java/rules/java/logging-java.html#AvoidPrintStackTrace)
