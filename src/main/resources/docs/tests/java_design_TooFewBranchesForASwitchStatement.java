//#Patterns: java_design_TooFewBranchesForASwitchStatement


public class Foo {
    public void bar() {
//#Warn: java_design_TooFewBranchesForASwitchStatement
        switch (condition) {
            case ONE:
                instruction;
                break;
            default:
                break; // not enough for a 'switch' stmt, a simple 'if' stmt would have been more appropriate
        }
    }
    public void bar2() {
	    switch (condition) {
	        case 1:
	            instruction;
	            break;
	        case 2:
	            instruction;
	            break;
	   		case 3:
	            instruction;
	            break;
	        default:
	            break; // not enough for a 'switch' stmt, a simple 'if' stmt would have been more appropriate
    	}
	}
}