Since: PMD 6.0.0

Reports loops that can be safely replaced with the foreach syntax. The rule considers loops over
lists, arrays and iterators. A loop is safe to replace if it only uses the index variable to
access an element of the list or array, only has one update statement, and loops through *every*
element of the list or array left to right.

Example(s):
```
public class MyClass {
  void loop(List<String> l) {
    for (int i = 0; i < l.size(); i++) { // pre Java 1.5
      System.out.println(l.get(i));
    }

    for (String s : l) {        // post Java 1.5
      System.out.println(s);
    }
  }
}
```
