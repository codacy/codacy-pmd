Avoid unused `import` statements.

This rule will find unused on demand `imports`, i.e. `import com.foo.*`.

Ex:

```
import java.io.*; // not referenced or required

public class Foo {
	
}
```

[Source](http://pmd.sourceforge.net/pmd-5.3.2/pmd-java/rules/java/typeresolution.html#UnusedImports)
