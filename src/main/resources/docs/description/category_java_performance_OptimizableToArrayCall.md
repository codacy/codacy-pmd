Since: PMD 1.8

Calls to a collection's `toArray(E[])` method should specify a target array of zero size. This allows the JVM
to optimize the memory allocation and copying as much as possible.

Previous versions of this rule (pre PMD 6.0.0) suggested the opposite, but current JVM implementations
perform always better, when they have full control over the target array. And allocation an array via
reflection is nowadays as fast as the direct allocation.

See also [Arrays of Wisdom of the Ancients](https://shipilev.net/blog/2016/arrays-wisdom-ancients/)

Note: If you don't need an array of the correct type, then the simple `toArray()` method without an array
is faster, but returns only an array of type `Object[]`.

Example(s):
```
List<Foo> foos = getFoos();

// much better; this one allows the jvm to allocate an array of the correct size and effectively skip
// the zeroing, since each array element will be overridden anyways
Foo[] fooArray = foos.toArray(new Foo[0]);

// inefficient, the array needs to be zeroed out by the jvm before it is handed over to the toArray method
Foo[] fooArray = foos.toArray(new Foo[foos.size()]);
```
