Since: PMD 7.0.0

Force tries should be avoided. If the code being wrapped happens to raise and exception, our application will crash.
            Consider using a conditional try and handling the resulting optional, or wrapping the try statement in a do-catch block.

Example(s):
```
let x = try! someThrowingFunction() // violation, force trying

let x = try? someThrowingFunction() // no violation
```
