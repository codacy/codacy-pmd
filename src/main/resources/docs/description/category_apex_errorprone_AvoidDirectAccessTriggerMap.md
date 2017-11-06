Since: PMD 6.0.0

Avoid directly accessing Trigger.old and Trigger.new as it can lead to a bug. Triggers should be bulkified and iterate through the map to handle the actions for each item separately.

Example(s):
```
trigger AccountTrigger on Account (before insert, before update) {
   Account a = Trigger.new[0]; //Bad: Accessing the trigger array directly is not recommended.
   
   foreach ( Account a : Trigger.new ){   
        //Good: Iterate through the trigger.new array instead.
   }
}
```
