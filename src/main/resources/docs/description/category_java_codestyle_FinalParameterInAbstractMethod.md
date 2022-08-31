Since: PMD 6.42.0

Declaring a method parameter as final for an interface method is useless because the implementation may choose to not respect it.

Example(s):
```
public interface MyInterface {
  void process(final Object arg); // Avoid using final here
}
```
