//#Patterns: basic_JumbledIncrementer
public class JumbledIncrementerRule1 {

    public void foo() {
        for (int i = 0; i < 10; i++) {			// only references 'i'
            //#Err: basic_JumbledIncrementer
            for (int k = 0; k < 20; i++) {		// references both 'i' and 'k'
                System.out.println("Hello");
            }
        }
    }
}