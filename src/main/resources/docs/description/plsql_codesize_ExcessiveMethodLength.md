Since: PMD 5.1

When methods are excessively long this usually indicates that the method is doing more than its
name/signature might suggest. They also become challenging for others to digest since excessive 
scrolling causes readers to lose focus.
Try to reduce the method length by creating helper methods and removing any copy/pasted code.

Example(s):
```
CREATE OR REPLACE
PROCEDURE doSomething BEGIN
	DBMS_OUTPUT.PUT_LINE("Hello world!");
	DBMS_OUTPUT.PUT_LINE("Hello world!");
		-- 98 copies omitted for brevity.
END;
```
