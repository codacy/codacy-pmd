Use Environment.getExternalStorageDirectory() instead of “/sdcard”

Ex:

   
public class MyActivity extends Activity {
	protected void foo() {
		String storageLocation = "/sdcard/mypackage";	// hard-coded, poor approach

		storageLocation = Environment.getExternalStorageDirectory() + "/mypackage"; // preferred approach
	}
}


[SOURCE](https://pmd.github.io/pmd-5.3.3/pmd-java/rules/java/android.html#DoNotHardCodeSDCard)
