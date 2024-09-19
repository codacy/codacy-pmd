//#Patterns: category_java_errorprone_CallSuperLast


public class DummyActivity extends Activity {
    public void onPause() {
        //#Warn: category_java_errorprone_CallSuperLast
        foo();
        // missing call to super.onPause()

    }
}
