//#Patterns: java_android_CallSuperLast


public class DummyActivity extends Activity {
    public void onPause() {
        //#Warn: java_android_CallSuperLast
        foo();
        // missing call to super.onPause()

    }
}