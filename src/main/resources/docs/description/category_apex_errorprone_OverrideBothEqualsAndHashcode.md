Since: PMD 6.31.0

Override both `public Boolean equals(Object obj)`, and `public Integer hashCode()`, or override neither.
Even if you are inheriting a hashCode() from a parent class, consider implementing hashCode and explicitly
delegating to your superclass.

This is especially important when [Using Custom Types in Map Keys and Sets](https://developer.salesforce.com/docs/atlas.en-us.apexcode.meta/apexcode/langCon_apex_collections_maps_keys_userdefined.htm).

Example(s):
```
public class Bar {        // poor, missing a hashCode() method
    public Boolean equals(Object o) {
      // do some comparison
    }
}
public class Baz {        // poor, missing an equals() method
    public Integer hashCode() {
      // return some hash value
    }
}
public class Foo {        // perfect, both methods provided
    public Boolean equals(Object other) {
      // do some comparison
    }
    public Integer hashCode() {
      // return some hash value
    }
}
```
