//#Patterns: rulesets_java_android.xml_CallSuperLast


public class DummyActivity extends Activity {
    public void onPause() {
        //#Warn: rulesets_java_android.xml_CallSuperLast
        foo();
        // missing call to super.onPause()

    }
}