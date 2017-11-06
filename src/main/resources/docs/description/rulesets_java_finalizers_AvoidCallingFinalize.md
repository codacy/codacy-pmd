Since: PMD 3.0

The method Object.finalize() is called by the garbage collector on an object when garbage collection determines
that there are no more references to the object. It should not be invoked by application logic.

Example(s):
```
void foo() {
    Bar b = new Bar();
    b.finalize();
}
```
