//#Patterns: android_CallSuperLast


public class DummyActivity extends Activity {
    public void onPause() {
        //#Warn: android_CallSuperLast
        foo();
        // missing call to super.onPause()

    }
}