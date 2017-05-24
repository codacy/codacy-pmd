Since: PMD 0.9

Methods with numerous parameters are a challenge to maintain, especially if most of them share the
same datatype. These situations usually denote the need for new objects to wrap the numerous parameters.

Example(s):
```
public void addPerson(		// too many arguments liable to be mixed up
	int birthYear, int birthMonth, int birthDate, int height, int weight, int ssn) {

	. . . .
}
 
public void addPerson(		// preferred approach
	Date birthdate, BodyMeasurements measurements, int ssn) {

	. . . .
}
```
