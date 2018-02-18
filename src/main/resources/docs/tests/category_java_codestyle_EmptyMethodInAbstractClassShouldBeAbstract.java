//#Patterns: category_java_codestyle_EmptyMethodInAbstractClassShouldBeAbstract

public abstract class ShouldBeAbstract {
    
    public Object couldBeAbstract() {
        // Should be abstract method ?
        int i = 0;
        i++;
        return null;
    }

//#Warn: category_java_codestyle_EmptyMethodInAbstractClassShouldBeAbstract
    public void couldBeAbstract() {
    }
}
	

