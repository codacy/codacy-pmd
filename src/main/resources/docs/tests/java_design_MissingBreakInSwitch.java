//#Patterns: java_design_MissingBreakInSwitch
public class Foo {

public void bar(int status) {
//#Warn: java_design_MissingBreakInSwitch
    switch(status) {
      case CANCELLED:
        doCancelled();
        // break; hm, should this be commented out?
      case NEW:
        doNew();
        // is this really a fall-through?
      case REMOVED:
        doRemoved();
        // what happens if you add another case after this one?
      case OTHER: // empty case - this is interpreted as an intentional fall-through
      case ERROR:
        doErrorHandling();
        break;
    }
}
}
