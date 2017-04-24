Since: PMD 5.1

Methods with numerous parameters are a challenge to maintain, especially if most of them share the
same datatype. These situations usually denote the need for new objects to wrap the numerous parameters.

Example(s):
```
CREATE OR REPLACE
PROCEDURE addPerson(		-- too many arguments liable to be mixed up
	birthYear pls_integer, birthMonth pls_integer, birthDate pls_integer, height pls_integer, weight pls_integer, ssn pls_integer) {

	. . . .
END ADDPERSON;
 
CREATE OR REPLACE
PROCEDURE addPerson(		-- preferred approach
	birthdate DATE, measurements BodyMeasurements , ssn INTEGER) BEGIN

	. . . .
END;
```
