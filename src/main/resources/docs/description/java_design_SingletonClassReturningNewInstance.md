Since: PMD 5.4

Some classes contain overloaded getInstance. The problem with overloaded getInstance methods
is that the instance created using the overloaded method is not cached and so, 
 for each call and new objects will be created for every invocation.

Example(s):
```
class Singleton {
	private static Singleton instance = null;
	public static Singleton getInstance() {
	synchronized(Singleton.class){
		return new Singleton();					
	}
	}
}
```

[Source](https://pmd.github.io/pmd-5.5.4/pmd-java/rules/java/design.html#SingletonClassReturningNewInstance)
