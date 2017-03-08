Since: PMD 5.5.0

As triggers do not allow methods like regular classes they are less flexible and suited to apply good encapsulation style.
Therefore delegate the triggers work to a regular class (often called Trigger handler class).

See more here: https://developer.salesforce.com/page/Trigger_Frameworks_and_Apex_Trigger_Best_Practices

Example(s):
```
trigger Accounts on Account (before insert, before update, before delete, after insert, after update, after delete, after undelete) {
	for(Account acc : Trigger.new) {           
		if(Trigger.isInsert) {
			...
		}
		
		...
		
		if(Trigger.isDelete) {
			...
		}
	}
}
```

[Source](https://pmd.github.io/pmd-5.5.4/pmd-apex/rules/apex/style.html#AvoidLogicInTrigger)
