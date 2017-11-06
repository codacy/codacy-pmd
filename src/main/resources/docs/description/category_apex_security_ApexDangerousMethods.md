Since: PMD 5.5.3

Checks against calling dangerous methods.

For the time being, it reports:

* Against `FinancialForce`'s `Configuration.disableTriggerCRUDSecurity()`. Disabling CRUD security
opens the door to several attacks and requires manual validation, which is unreliable.
* Calling `System.debug` passing sensitive data as parameter, which could lead to exposure
of private data.

Example(s):
```
public class Foo {
    public Foo() {
        Configuration.disableTriggerCRUDSecurity();
    }
}
```
