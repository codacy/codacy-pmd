//#Patterns: java_android_DoNotHardCodeSDCard

public class MyActivity extends Activity {
    protected void foo() {

    //#Warn: java_android_DoNotHardCodeSDCard
        String storageLocation = "/sdcard/mypackage";// hard-coded, poor approach
        storageLocation = Environment.getExternalStorageDirectory() + "/mypackage"; // preferred approach

    }
}

