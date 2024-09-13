Since: PMD 7.0.0

This rule finds method calls inside loops that are known to be likely a performance issue. These methods should be
called only once before the loop.

Schema class methods like [Schema.getGlobalDescribe()](https://developer.salesforce.com/docs/atlas.en-us.apexref.meta/apexref/apex_methods_system_schema.htm#apex_System_Schema_getGlobalDescribe)
and [Schema.describeSObjects()](https://developer.salesforce.com/docs/atlas.en-us.apexref.meta/apexref/apex_methods_system_schema.htm#apex_System_Schema_describeSObjects)
might be slow depending on the size of your organization. Calling these methods repeatedly inside a loop creates
a potential performance issue.

Example(s):
```
public class GlobalDescribeExample {
    // incorrect example
    public void getGlobalDescribeInLoop() {
        Set<String> fieldNameSet = new Set<String> {'Id'};
        for (String fieldNameOrDefaultValue : fieldNameOrDefaultValueList) {
            // Schema.getGlobalDescribe() should be called only once before the for-loop
            if (Schema.getGlobalDescribe().get(objectName).getDescribe().fields.getMap().containsKey(fieldNameOrDefaultValue.trim())) {
                fieldNameSet.add(fieldNameOrDefaultValue);
            }
        }
    }

    // corrected example
    public void getGlobalDescribeInLoopCorrected() {
        Map<String, Schema.SObjectField> fieldMap = Schema.getGlobalDescribe().get(objectName).getDescribe().fields.getMap();
        Set<String> fieldNameSet = new Set<String> {'Id'};
        for (String fieldNameOrDefaultValue : fieldNameOrDefaultValueList) {
            if (fieldMap.containsKey(fieldNameOrDefaultValue.trim())) {
                fieldNameSet.add(fieldNameOrDefaultValue);
            }
        }
    }
}
        
public class DescribeSObjectsExample {
    // incorrect example
    public void describeSObjectsInLoop() {
        Set<String> fieldNameSet = new Set<String> {'Id'};
        for (String fieldNameOrDefaultValue : fieldNameOrDefaultValueList) {
            Schema.DescribeSObjectResult dsr = Account.sObjectType.getDescribe();
            if (Schema.describeSObjects(new List<String> { sObjectType })[0].fields.getMap().containsKey(fieldNameOrDefaultValue.trim())) {
                fieldNameSet.add(fieldNameOrDefaultValue);
            }
        }
    }

    // corrected example
    public void describeSObjectsInLoop() {
        Map<String, Schema.SObjectField> fieldMap = Schema.describeSObjects(new List<String> { 'Account' })[0].fields.getMap();
        Set<String> fieldNameSet = new Set<String> {'Id'};
        for (String fieldNameOrDefaultValue : fieldNameOrDefaultValueList) {
            if (fieldMap.containsKey(fieldNameOrDefaultValue.trim())) {
                fieldNameSet.add(fieldNameOrDefaultValue);
            }
        }
    }
}
```
