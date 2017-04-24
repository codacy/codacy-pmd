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
