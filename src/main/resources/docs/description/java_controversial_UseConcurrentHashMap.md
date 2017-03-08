Since: PMD 4.2.6

Since Java5 brought a new implementation of the Map designed for multi-threaded access, you can
perform efficient map reads without blocking other threads.

Example(s):
```
public class ConcurrentApp {
  public void getMyInstance() {
    Map map1 = new HashMap(); 	// fine for single-threaded access
    Map map2 = new ConcurrentHashMap();  // preferred for use with multiple threads

    // the following case will be ignored by this rule
    Map map3 = someModule.methodThatReturnMap(); // might be OK, if the returned map is already thread-safe
  }
}
```

[Source](https://pmd.github.io/pmd-5.5.4/pmd-java/rules/java/controversial.html#UseConcurrentHashMap)
