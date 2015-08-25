//#Patterns: rulesets_java_android.xml_CallSuperFirst


public class DummyActivity extends Activity {

    //#Warn: rulesets_java_android.xml_CallSuperFirst
    public void onCreate(Bundle bundle) {
        // missing call to super.onCreate(bundle)
        foo();
    }
}

