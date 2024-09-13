Since: PMD 5.5.0

Classes with large numbers of public methods, attributes, and properties require disproportionate testing efforts
since combinatorial side effects grow rapidly and increase risk. Refactoring these classes into
smaller ones not only increases testability and reliability but also allows new variations to be
developed easily.

Example(s):
```
public class Foo {
    public String value;
    public Bar something;
    public Variable var;
    // [... more more public attributes ...]

    public void doWork() {}
    public void doMoreWork() {}
    public void doWorkAgain() {}
    // [... more more public methods ...]

    public String property1 { get; set; }
    // [... more more public properties ...]
}
```
