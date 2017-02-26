When you write a public method, you should be thinking in terms of an API. If your method is public, it means other class will use it, therefore, you will want to offer a comprehensive and evolutive API.

If you pass a lot of information as a simple series of Strings, you may think of using an Object to represent all that information. You’ll get a simplier API, rather than a tedious series of Strings and more importantly, if you need at some point to pass extra data, you’ll be able to do so by simply modifying or extending Workload without any modification to your API.

Ex:

```
public class MyClass {
  public void connect(String username, String pssd, String databaseName, String databaseAdress) {
    // Instead of those parameters object
    // would ensure a cleaner API and permit 
    // to add extra data transparently (no code change):
    // void connect(UserData data);
  }
}
```

[Source](http://pmd.sourceforge.net/pmd-5.3.2/pmd-java/rules/java/controversial.html#UseObjectForClearerAPI)
