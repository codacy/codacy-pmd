Since: PMD 7.0.0

Override both public boolean Object.equals(Object other), and public int Object.hashCode(), or override neither.  Even if you are inheriting a hashCode() from a parent class, consider implementing hashCode and explicitly delegating to your superclass.

Example(s):
```
class Bar {        // poor, missing a hashCode() method
    override fun equals(o: Any?): Boolean {
      // do some comparison
    }
}

class Baz {        // poor, missing an equals() method
    override fun hashCode(): Int {
      // return some hash value
    }
}

class Foo {        // perfect, both methods provided
    override fun equals(other: Any?): Boolean {
      // do some comparison
    }
    override fun hashCode(): Int {
      // return some hash value
    }
}
```
