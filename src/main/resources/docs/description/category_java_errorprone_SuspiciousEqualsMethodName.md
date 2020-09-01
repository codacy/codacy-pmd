Since: PMD 2.0

The method name and parameter number are suspiciously close to `Object.equals`, which can denote an
intention to override it. However, the method does not override `Object.equals`, but overloads it instead.
Overloading `Object.equals` method is confusing for other programmers, error-prone and hard to maintain,
especially when using inheritance, because `@Override` annotations used in subclasses can provide a false
sense of security. For more information on `Object.equals` method, see Effective Java, 3rd Edition,
Item 10: Obey the general contract when overriding equals.

Example(s):
```
public class Foo {
   public int equals(Object o) {
     // oops, this probably was supposed to be boolean equals
   }
   public boolean equals(String s) {
     // oops, this probably was supposed to be equals(Object)
   }
   public boolean equals(Object o1, Object o2) {
     // oops, this probably was supposed to be equals(Object)
   }
}
```
