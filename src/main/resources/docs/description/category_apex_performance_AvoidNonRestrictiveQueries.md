Since: PMD 7.4.0

When working with very large amounts of data, unfiltered SOQL or SOSL queries can quickly cause
            [governor limit](https://developer.salesforce.com/docs/atlas.en-us.apexcode.meta/apexcode/apex_gov_limits.htm)
            exceptions.

Example(s):
```
public class Something {
    public static void main( String[] as ) {
        Account[] accs1 = [ select id from account ];  // Bad
        Account[] accs2 = [ select id from account limit 10 ];  // better

        List<List<SObject>> searchList = [FIND 'map*' IN ALL FIELDS RETURNING Account (Id, Name), Contact, Opportunity, Lead]; // bad
    }
}
```
