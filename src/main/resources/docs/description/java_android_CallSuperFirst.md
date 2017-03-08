Since: PMD 4.2.5

Super should be called at the start of the method

Example(s):
```
public class DummyActivity extends Activity {
	public void onCreate(Bundle bundle) {
     // missing call to super.onCreate(bundle)
		foo();
	}
}
```

[Source](https://pmd.github.io/pmd-5.5.4/pmd-java/rules/java/android.html#CallSuperFirst)
