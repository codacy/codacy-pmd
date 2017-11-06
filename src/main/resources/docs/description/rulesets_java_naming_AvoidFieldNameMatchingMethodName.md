Since: PMD 3.0

It can be confusing to have a field name with the same name as a method. While this is permitted, 
having information (field) and actions (method) is not clear naming. Developers versed in 
Smalltalk often prefer this approach as the methods denote accessor methods.

Example(s):
```
public class Foo {
    Object bar;
    // bar is data or an action or both?
    void bar() {
    }
}
```
