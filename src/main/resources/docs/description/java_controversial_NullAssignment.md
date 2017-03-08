Since: PMD 1.02

Assigning a &quot;null&quot; to a variable (outside of its declaration) is usually bad form.  Sometimes, this type
of assignment is an indication that the programmer doesn't completely understand what is going on in the code.

NOTE: This sort of assignment may used in some cases to dereference objects and encourage garbage collection.

Example(s):
```
public void bar() {
  Object x = null; // this is OK
  x = new Object();
     // big, complex piece of code here
  x = null; // this is not required
     // big, complex piece of code here
}
```

[Source](https://pmd.github.io/pmd-5.5.4/pmd-java/rules/java/controversial.html#NullAssignment)
