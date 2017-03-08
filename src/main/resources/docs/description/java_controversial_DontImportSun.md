Since: PMD 1.5

Avoid importing anything from the 'sun.*' packages.  These packages are not portable and are likely to change.

Example(s):
```
import sun.misc.foo;
public class Foo {}
```

[Source](https://pmd.github.io/pmd-5.5.4/pmd-java/rules/java/controversial.html#DontImportSun)
