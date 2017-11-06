Since: PMD 3.9

The NPath complexity of a method is the number of acyclic execution paths through that method.
            While cyclomatic complexity counts the number of decision points in a method, NPath counts the number of
            full paths from the beginning to the end of the block of the method. That metric grows exponentially, as
            it multiplies the complexity of statements in the same block. For more details on the calculation, see the
            documentation of the [NPath metric](/pmd_java_metrics_index.html#npath-complexity-npath).

            A threshold of 200 is generally considered the point where measures should be taken to reduce
            complexity and increase readability.

Example(s):
```
public class Foo {
  public static void bar() { // Ncss = 252: reported!
    boolean a, b = true;
    try { // 2 * 2 + 2 = 6
      if (true) { // 2
        List buz = new ArrayList();
      }

      for(int i = 0; i < 19; i++) { // * 2
        List buz = new ArrayList();
      }
    } catch(Exception e) {
      if (true) { // 2
        e.printStackTrace();
      }
    }

    while (j++ < 20) { //  * 2
      List buz = new ArrayList();
    }

    switch(j) { // * 7
      case 1:
      case 2: break;
      case 3: j = 5; break;
      case 4: if (b && a) { bar(); } break;
      default: break;
    }

    do { // * 3
        List buz = new ArrayList();
    } while (a && j++ < 30);
  }
}
```
