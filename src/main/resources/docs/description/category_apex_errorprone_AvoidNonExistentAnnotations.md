Since: PMD 6.5.0

Apex supported non existent annotations for legacy reasons.
            In the future, use of such non-existent annotations could result in broken apex code that will not compile.
            This will prevent users of garbage annotations from being able to use legitimate annotations added to Apex in the future.
            A full list of supported annotations can be found at https://developer.salesforce.com/docs/atlas.en-us.apexcode.meta/apexcode/apex_classes_annotation.htm

Example(s):
```
@NonExistentAnnotation public class ClassWithNonexistentAnnotation {
	@NonExistentAnnotation public void methodWithNonExistentAnnotation() {
		// ...
	}
}
```
