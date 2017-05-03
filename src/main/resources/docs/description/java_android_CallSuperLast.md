Since: PMD 4.2.5

Super should be called at the end of the method

Example(s):
```
public class DummyActivity extends Activity {
	public void onPause() {
		foo();
		// missing call to super.onPause()
	}
}
```

[Source](https://pmd.github.io/pmd-5.6.1/pmd-java/rules/java/android.html#CallSuperLast)
