Since: PMD 5.0

Avoid using classes from the configured package hierarchy outside of the package hierarchy, 
except when using one of the configured allowed classes.

Example(s):
```
package some.package;

import some.other.package.subpackage.subsubpackage.DontUseThisClass;

public class Bar {
   DontUseThisClass boo = new DontUseThisClass();
}
```
