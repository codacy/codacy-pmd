There is no need to import a type that lives in the same package.

Ex:

package foo; 
import foo.Buz; // no need for this 
import foo.*; // or this 

public class Bar{}

[SOURCE](https://pmd.github.io/pmd-5.3.3/pmd-java/rules/java/imports.html#ImportFromSamePackage)
