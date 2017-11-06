Since: PMD 6.0.0

Sosl calls within loops can cause governor limit exceptions.

Example(s):
```
public class Something {
    public static void main( String as[] ) {
        for (Integer i = 0; i < 10; i++) {
            List<List<SObject>> searchList = [FIND 'map*' IN ALL FIELDS RETURNING Account (Id, Name), Contact, Opportunity, Lead];
        }
    }
}
```
