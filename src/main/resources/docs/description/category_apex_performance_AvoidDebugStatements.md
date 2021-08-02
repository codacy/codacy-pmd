Since: PMD 6.36.0

Debug statements contribute to longer transactions and consume Apex CPU time even when debug logs are not being captured.

When possible make use of other debugging techniques such as the Apex Replay Debugger and Checkpoints that could cover *most* use cases.

For other valid use cases that the statement is in fact valid make use of the `@SuppressWarnings` annotation or the `//NOPMD` comment.

Example(s):
```
public class Foo {
    public void bar() {
        Account acc = [SELECT Name, Owner.Name FROM Account LIMIT 1];
        System.debug(accs); // will get reported
    }

    @SuppressWarnings('PMD.AvoidDebugStatements')
    public void baz() {
        try {
            Account myAccount = bar();
        } catch (Exception e) {
            System.debug(LoggingLevel.ERROR, e.getMessage()); // good to go
        }
    }
}
```
