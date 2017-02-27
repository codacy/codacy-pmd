If the `finalize()` is implemented, its last action should **always** be to call `super.finalize()`.

Ex:

```
protected void finalize() {
  something();
  super.finalize(); //the right way
}
```

[Source](http://pmd.sourceforge.net/pmd-5.3.2/pmd-java/rules/java/finalizers.html#FinalizeDoesNotCallSuperFinalize)
