Since: PMD 1.5

Avoid importing anything from the 'sun.*' packages. These packages are not portable
and are likely to change.

If you find yourself having to depend on Sun APIs, confine this dependency to as
small a scope as possible, for instance by writing a stable wrapper class around
the unstable API. You can then suppress this rule in the implementation of the wrapper.

Example(s):
```
import sun.misc.foo;
public class Foo {}
```
