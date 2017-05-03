Since: PMD 0.5

Avoid importing anything from the package 'java.lang'.  These classes are automatically imported (JLS 7.5.3).

Example(s):
```
import java.lang.String;	// this is unnecessary

public class Foo {}

// --- in another source code file...

import java.lang.*;	// this is bad

public class Foo {}
```

[Source](https://pmd.github.io/pmd-5.6.1/pmd-java/rules/java/imports.html#DontImportJavaLang)
