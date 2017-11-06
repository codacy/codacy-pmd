Since: PMD 5.5.0

Methods with numerous parameters are a challenge to maintain, especially if most of them share the
same datatype. These situations usually denote the need for new objects to wrap the numerous parameters.

Example(s):
```
// too many arguments liable to be mixed up
public void addPerson(int birthYear, int birthMonth, int birthDate, int height, int weight, int ssn) {
    // ...
}
// preferred approach 
public void addPerson(Date birthdate, BodyMeasurements measurements, int ssn) {
    // ...
}
```
