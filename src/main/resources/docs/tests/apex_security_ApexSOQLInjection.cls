//#Patterns: apex_security_ApexSOQLInjection

public class Foo {
    public void test1() {
        String field1 = getSomeID();
        String field2 = 'SELECT Id FROM Account WHERE Id =';
        //#Err: apex_security_ApexSOQLInjection
        Database.query(field2 + field1);
    }
}
