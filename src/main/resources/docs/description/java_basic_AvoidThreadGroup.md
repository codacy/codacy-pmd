Since: PMD 3.6

Avoid using java.lang.ThreadGroup; although it is intended to be used in a threaded environment
it contains methods that are not thread-safe.

Example(s):
```
public class Bar {
	void buz() {
		ThreadGroup tg = new ThreadGroup("My threadgroup") ;
		tg = new ThreadGroup(tg, "my thread group");
		tg = Thread.currentThread().getThreadGroup();
		tg = System.getSecurityManager().getThreadGroup();
	}
}
```

[Source](https://pmd.github.io/pmd-5.6.1/pmd-java/rules/java/basic.html#AvoidThreadGroup)
