Since: PMD 3.0

Test classes end with the suffix Test. Having a non-test class with that name is not a good practice, 
since most people will assume it is a test case. Test classes have test methods named testXXX.

Example(s):
```
//Consider changing the name of the class if it is not a test
//Consider adding test methods if it is a test
public class CarTest {
   public static void main(String[] args) {
    // do something
   }
   // code
}
```
