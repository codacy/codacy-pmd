//#Patterns: java_android_CallSuperFirst

public class DummyActivity extends Activity {

    //#Warn: java_android_CallSuperFirst
    public void onCreate(Bundle bundle) {
        // missing call to super.onCreate(bundle)
        foo();
    }
}

