Super should be called at the end of the method

Ex:

public class DummyActivity extends Activity { 
	public void onPause() { 
		foo(); 
		// missing call to super.onPause() 
	} 
}

[SOURCE](https://pmd.github.io/pmd-5.3.3/pmd-java/rules/java/android.html#CallSuperLast)
