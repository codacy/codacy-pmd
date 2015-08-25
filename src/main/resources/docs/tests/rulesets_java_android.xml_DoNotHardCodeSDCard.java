//#Patterns: rulesets_java_android.xml_DoNotHardCodeSDCard

public class MyActivity extends Activity {
    protected void foo() {

    //#Warn: rulesets_java_android.xml_DoNotHardCodeSDCard
        String storageLocation = "/sdcard/mypackage";// hard-coded, poor approach
        storageLocation = Environment.getExternalStorageDirectory() + "/mypackage"; // preferred approach

    }
}

