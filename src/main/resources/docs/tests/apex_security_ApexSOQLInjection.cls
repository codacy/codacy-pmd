//#Patterns: apex_security_ApexSOQLInjection, apex_security_ApexInsecureEndpoint

public class Foo {
    public void test1() {
        String field1 = getSomeID();
        //#Err: apex_security_ApexSOQLInjection
        String field2 = 'SELECT Id FROM Account WHERE Id =';
        Database.query(field2 + field1);
    }
}

public class Foo {
    void foo() {
        HttpRequest req = new HttpRequest();
        //#Err: apex_security_ApexInsecureEndpoint
        req.setEndpoint('http://localhost:com' + somevar);
    }
}
