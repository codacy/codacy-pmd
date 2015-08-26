Super should be called at the start of the method

Ex:

public class DummyActivity extends Activity { 
	public void onCreate(Bundle bundle) { 
		// missing call to super.onCreate(bundle) 
		foo(); 
	} 
}

[SOURCE](https://pmd.github.io/pmd-5.3.3/pmd-java/rules/java/android.html#CallSuperFirst)
