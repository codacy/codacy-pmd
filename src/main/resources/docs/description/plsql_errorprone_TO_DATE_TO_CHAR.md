Since: PMD 5.1

TO_DATE(TO_CHAR(date-variable)) used to remove time component - use TRUNC(date-variable)

Example(s):
```
CREATE OR REPLACE PACKAGE BODY date_utilities
IS

-- Take single parameter, relying on current default NLS date format
FUNCTION strip_time (p_date IN DATE) RETURN DATE
IS
BEGIN
   RETURN TO_DATE(TO_CHAR(p_date));
END strip_time;


END date_utilities;
/
```
