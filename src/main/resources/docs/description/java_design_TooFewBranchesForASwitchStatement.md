Since: PMD 4.2

Switch statements are indended to be used to support complex branching behaviour. Using a switch for only a few 
cases is ill-advised, since switches are not as easy to understand as if-then statements. In these cases use the
if-then statement to increase code readability.

Example(s):
```
// With a minimumNumberCaseForASwitch of 3
public class Foo {
    public void bar() {
        switch (condition) {
            case ONE:
                instruction;
                break;
            default:
                break; // not enough for a 'switch' stmt, a simple 'if' stmt would have been more appropriate
        }
    }
}
```
