Since: PMD 7.0.0

Creating views using Interface Builder should be avoided.
            Defining views by code allows the compiler to detect issues that otherwise will be runtime errors.
            It's difficult to review the auto-generated code and allow concurrent modifications of those files.
            Consider building views programmatically.

Example(s):
```
class ViewController: UIViewController {
    @IBOutlet var label: UILabel! // violation, referencing a IBOutlet
}

class ViewController: UIViewController {
    var label: UILabel!
}
```
