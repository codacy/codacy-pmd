//#Patterns: java_design_EmptyMethodInAbstractClassShouldBeAbstract

public abstract class ShouldBeAbstract {
    
    public Object couldBeAbstract() {
        // Should be abstract method ?
        int i = 0;
        i++;
        return null;
    }

//#Warn: java_design_EmptyMethodInAbstractClassShouldBeAbstract
    public void couldBeAbstract() {
    }
}
	

