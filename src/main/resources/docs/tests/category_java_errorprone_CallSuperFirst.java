//#Patterns: category_java_errorprone_CallSuperFirst

public class DummyActivity extends Activity {

    //#Warn: category_java_errorprone_CallSuperFirst
    public void onCreate(Bundle bundle) {
        // missing call to super.onCreate(bundle)
        foo();
    }
}

