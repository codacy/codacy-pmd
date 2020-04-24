Since: PMD 5.5.0

Methods with numerous parameters are a challenge to maintain, especially if most of them share the
same datatype. These situations usually denote the need for new objects to wrap the numerous parameters.

Example(s):
```
// too many arguments liable to be mixed up
public void addPerson(Integer birthYear, Integer birthMonth, Integer birthDate, Integer height, Integer weight, Integer ssn) {
    // ...
}
// preferred approach
public void addPerson(Date birthdate, BodyMeasurements measurements, int ssn) {
    // ...
}
```
