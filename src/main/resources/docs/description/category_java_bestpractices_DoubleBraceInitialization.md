Since: PMD 6.16.0

Double brace initialisation is a pattern to initialise eg collections concisely. But it implicitly
            generates a new .class file, and the object holds a strong reference to the enclosing object. For those
            reasons, it is preferable to initialize the object normally, even though it's verbose.

            This rule counts any anonymous class which only has a single initializer as an instance of double-brace
            initialization. There is currently no way to find out whether a method called in the initializer is not
            accessible from outside the anonymous class, and those legit cases should be suppressed for the time being.

Example(s):
```
// this is double-brace initialization
return new ArrayList<String>(){{
    add("a");
    add("b");
    add("c");
}};

// the better way is to not create an anonymous class:
List<String> a = new ArrayList<>();
a.add("a");
a.add("b");
a.add("c");
return a;
```
