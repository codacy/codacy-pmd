Since: PMD 6.9.0

This rule verifies that the PLSQL code is properly formatted. The following checks are executed:

SQL Queries:

*   The selected columns must be each on a new line
*   The keywords (BULK COLLECT INTO, FROM) start on a new line and are indented by one level
*   UNION should be on the same indentation level as SELECT
*   Each JOIN is on a new line. If there are more than one JOIN conditions, then each condition should be
    on a separate line.

Parameter definitions for procedures:

*   Each parameter should be on a new line
*   Variable names as well as their types should be aligned

Variable declarations:

*   Each variable should be on a new line
*   Variable names as well as their types should be aligned

Calling a procedure:

*   If there are more than 3 parameters
    *   then named parameters should be used
    *   and each parameter should be on a new line

Example(s):
```
BEGIN
  -- select columns each on a separate line
  SELECT cmer_id
        ,version
        ,cmp_id
    BULK COLLECT INTO v_cmer_ids
        ,v_versions
        ,v_cmp_ids
    FROM cmer;

  -- each parameter on a new line
  PROCEDURE create_prospect(
    company_info_in      IN    prospects.company_info%TYPE -- Organization
   ,firstname_in         IN    persons.firstname%TYPE      -- FirstName
   ,lastname_in          IN    persons.lastname%TYPE       -- LastName
  );

  -- more than three parameters, each parameter on a separate line
  webcrm_marketing.prospect_ins(
    cmp_id_in            => NULL
   ,company_info_in      => company_info_in
   ,firstname_in         => firstname_in
   ,lastname_in          => lastname_in
   ,slt_code_in          => NULL
  );

END;
```
