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
