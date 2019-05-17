Since: PMD 6.13.0

The second parameter of System.assert/third parameter of System.assertEquals/System.assertNotEquals is a message.
Having a second/third parameter provides more information and makes it easier to debug the test failure and
improves the readability of test output.

Example(s):
```
@isTest
public class Foo {
     @isTest
    static void methodATest() {
        System.assertNotEquals('123', o.StageName); // not good
        System.assertEquals('123', o.StageName, 'Opportunity stageName is wrong.'); // good
        System.assert(o.isClosed); // not good
        System.assert(o.isClosed, 'Opportunity is not closed.'); // good
    }
}
```
