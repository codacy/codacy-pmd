Since: PMD 6.11.0

Reassigning loop variables can lead to hard-to-find bugs. Prevent or limit how these variables can be changed.

In foreach-loops, configured by the `foreachReassign` property:
- `deny`: Report any reassignment of the loop variable in the loop body. _This is the default._
- `allow`: Don't check the loop variable.
- `firstOnly`: Report any reassignments of the loop variable, except as the first statement in the loop body.
            _This is useful if some kind of normalization or clean-up of the value before using is permitted, but any other change of the variable is not._

In for-loops, configured by the `forReassign` property:
- `deny`: Report any reassignment of the control variable in the loop body. _This is the default._
- `allow`: Don't check the control variable.
- `skip`: Report any reassignments of the control variable, except conditional increments/decrements (`++`, `--`, `+=`, `-=`).
            _This prevents accidental reassignments or unconditional increments of the control variable._

Example(s):
```
public class Foo {
  private void foo() {
    for (String s : listOfStrings()) {
      s = s.trim(); // OK, when foreachReassign is "firstOnly" or "allow"
      doSomethingWith(s);

      s = s.toUpper(); // OK, when foreachReassign is "allow"
      doSomethingElseWith(s);
    }

    for (int i=0; i < 10; i++) {
      if (check(i)) {
        i++; // OK, when forReassign is "skip" or "allow"
      }

      i = 5;  // OK, when forReassign is "allow"

      doSomethingWith(i);
    }
  }
}
```
