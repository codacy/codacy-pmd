Since: PMD 1.02

There is no need to import a type that lives in the same package.

Example(s):
```
package foo;
 
 import foo.Buz; // no need for this
 import foo.*; // or this
 
 public class Bar{}
```
