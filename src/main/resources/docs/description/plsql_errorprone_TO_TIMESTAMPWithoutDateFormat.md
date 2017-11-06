Since: PMD 5.1

TO_TIMESTAMP without date format- use TO_TIMESTAMP(expression, date-format)

Example(s):
```
CREATE OR REPLACE PACKAGE BODY date_utilities
IS

-- Take single parameter, relying on current default NLS date format
FUNCTION to_timestamp_single_parameter (p_date_string IN VARCHAR2) RETURN DATE
IS
BEGIN
   RETURN TO_TIMESTAMP(p_date_string);
END to_timestamp_single_parameter;

-- Take 2 parameters, using an explicit date format string
FUNCTION to_timestamp_two_parameters (p_date_string IN VARCHAR2, p_format_mask IN VARCHAR2) RETURN DATE
IS
BEGIN
   TO_TIMESTAMP(p_date_string, p_date_format);
END to_timestamp_two_parameters;

-- Take 3 parameters, using an explicit date format string and an explicit language
FUNCTION to_timestamp_three_parameters (p_date_string IN VARCHAR2, p_format_mask IN VARCHAR2, p_nls_language VARCHAR2 ) RETURN DATE
IS
BEGIN
   TO_TIMESTAMP(p_date_string, p_format_mask, p_nls_language);
END to_timestamp_three_parameters;

END date_utilities;
/
```
