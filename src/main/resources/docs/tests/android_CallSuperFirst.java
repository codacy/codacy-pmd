//#Patterns: android_CallSuperFirst


public class DummyActivity extends Activity {

    //#Warn: android_CallSuperFirst
    public void onCreate(Bundle bundle) {
        // missing call to super.onCreate(bundle)
        foo();
    }
}

