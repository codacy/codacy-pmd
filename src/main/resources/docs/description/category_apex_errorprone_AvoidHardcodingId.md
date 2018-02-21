Since: PMD 6.0.0

When deploying Apex code between sandbox and production environments, or installing Force.com AppExchange packages,
it is essential to avoid hardcoding IDs in the Apex code. By doing so, if the record IDs change between environments,
the logic can dynamically identify the proper data to operate against and not fail.

Example(s):
```
public without sharing class Foo {
    void foo() {
        //Error - hardcoded the record type id
        if(a.RecordTypeId == '012500000009WAr'){
            //do some logic here.....
        } else if(a.RecordTypeId == '0123000000095Km'){
            //do some logic here for a different record type...
        }
    }
}
```
