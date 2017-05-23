Since: PMD 5.5.3

Detects hardcoded credentials used in requests to an endpoint.

You should refrain from hardcoding credentials:
  * They are hard to mantain by being mixed in application code
  * Particularly hard to update them when used from different classes
  * Granting a developer access to the codebase means granting knowledge
     of credentials, keeping a two-level access is not possible.
  * Using different credentials for different environments is troublesome
     and error-prone.

Instead, you should use *Named Credentials* and a callout endpoint.

For more information, you can check [this](https://developer.salesforce.com/docs/atlas.en-us.apexcode.meta/apexcode/apex_callouts_named_credentials.htm)

Example(s):
```
public class Foo {
    public void foo(String username, String password) {
        Blob headerValue = Blob.valueOf(username + ':' + password);
        String authorizationHeader = 'BASIC ' + EncodingUtil.base64Encode(headerValue);
        req.setHeader('Authorization', authorizationHeader);
    }
}
```
