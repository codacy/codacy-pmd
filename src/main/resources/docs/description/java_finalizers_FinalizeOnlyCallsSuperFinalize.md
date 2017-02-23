If the `finalize()` is implemented, it should do something besides just calling `super.finalize()`.

Ex:

```
protected void finalize() {
  super.finalize();  //Use it for more than this
}
```

[Source](http://pmd.sourceforge.net/pmd-5.3.2/pmd-java/rules/java/finalizers.html#FinalizeOnlyCallsSuperFinalize)
