//#Patterns: category_java_errorprone_DoNotHardCodeSDCard

public class MyActivity extends Activity {
    protected void foo() {

    //#Warn: category_java_errorprone_DoNotHardCodeSDCard
        String storageLocation = "/sdcard/mypackage";// hard-coded, poor approach
        storageLocation = Environment.getExternalStorageDirectory() + "/mypackage"; // preferred approach

    }
}

