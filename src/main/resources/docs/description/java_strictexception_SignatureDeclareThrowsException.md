Since: PMD 1.2

Methods that declare the generic Exception as a possible throwable are not very helpful since their
failure modes are unclear. Use a class derived from RuntimeException or a more specific checked exception.

Example(s):
```
public void foo() throws Exception {
}
```
