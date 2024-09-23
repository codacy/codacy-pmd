Since: PMD 7.0.0

Force casts should be avoided. This may lead to a crash if it's not used carefully.
            For example assuming a JSON property has a given type, or your reused Cell has a certain contract.
            Consider using conditional casting and handling the resulting optional.

Example(s):
```
NSNumber() as! Int // violation, force casting

NSNumber() as? Int // no violation
```
