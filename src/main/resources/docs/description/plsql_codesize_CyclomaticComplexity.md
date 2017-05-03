Since: PMD 5.1

Complexity directly affects maintenance costs is determined by the number of decision points in a method 
plus one for the method entry.  The decision points include 'if', 'while', 'for', and 'case labels' calls.  
Generally, numbers ranging from 1-4 denote low complexity, 5-7 denote moderate complexity, 8-10 denote
high complexity, and 11+ is very high complexity.

Example(s):
```
-- Cyclomatic Complexity of 25 
CREATE OR REPLACE PACKAGE BODY pkg_pmd_working_sequence  AS 
1 PROCEDURE ty_logger  IS BEGIN
2        IF true
         THEN
              DBMS_OUTPUT.PUT_LINE('IF/THEN l_Integer='||l_integer);         
3		 IF true
		 THEN
		      DBMS_OUTPUT.PUT_LINE('IF/THEN l_Integer='||l_integer);         
4			 IF true
			 THEN
			      DBMS_OUTPUT.PUT_LINE('IF/THEN l_Integer='||l_integer);         
5			 ELSIF false
			 THEN
				DBMS_OUTPUT.PUT_LINE('ELSIF l_Integer='||l_integer);             
			 ELSE
				DBMS_OUTPUT.PUT_LINE('ELSIF l_Integer='||l_integer);             
			 END IF;
6		 ELSIF false
		 THEN
			DBMS_OUTPUT.PUT_LINE('ELSIF l_Integer='||l_integer);             
7			 IF true
			 THEN
			      DBMS_OUTPUT.PUT_LINE('IF/THEN l_Integer='||l_integer);         
8			 ELSIF false
			 THEN
				DBMS_OUTPUT.PUT_LINE('ELSIF l_Integer='||l_integer);             
			 ELSE
				DBMS_OUTPUT.PUT_LINE('ELSIF l_Integer='||l_integer);             
			 END IF;
		 ELSE
			DBMS_OUTPUT.PUT_LINE('ELSIF l_Integer='||l_integer);             
9			 IF true
			 THEN
			      DBMS_OUTPUT.PUT_LINE('IF/THEN l_Integer='||l_integer);         
10			 ELSIF false
			 THEN
				DBMS_OUTPUT.PUT_LINE('ELSIF l_Integer='||l_integer);             
			 ELSE
				DBMS_OUTPUT.PUT_LINE('ELSIF l_Integer='||l_integer);             
			 END IF;
		 END IF;
11         ELSIF false
         THEN
		DBMS_OUTPUT.PUT_LINE('ELSIF l_Integer='||l_integer);             
12		 IF true
		 THEN
		      DBMS_OUTPUT.PUT_LINE('IF/THEN l_Integer='||l_integer);         
13			 IF true
			 THEN
			      DBMS_OUTPUT.PUT_LINE('IF/THEN l_Integer='||l_integer);         
14			 ELSIF false
			 THEN
				DBMS_OUTPUT.PUT_LINE('ELSIF l_Integer='||l_integer);             
			 ELSE
				DBMS_OUTPUT.PUT_LINE('ELSIF l_Integer='||l_integer);             
			 END IF;
15		 ELSIF false
		 THEN
16			 IF true
			 THEN
			      DBMS_OUTPUT.PUT_LINE('IF/THEN l_Integer='||l_integer);         
17			 ELSIF false
			 THEN
				DBMS_OUTPUT.PUT_LINE('ELSIF l_Integer='||l_integer);             
			 ELSE
				DBMS_OUTPUT.PUT_LINE('ELSIF l_Integer='||l_integer);             
			 END IF;
			DBMS_OUTPUT.PUT_LINE('ELSIF l_Integer='||l_integer);             
		 ELSE
			DBMS_OUTPUT.PUT_LINE('ELSIF l_Integer='||l_integer);             
		 END IF;
	 ELSE
		DBMS_OUTPUT.PUT_LINE('ELSIF l_Integer='||l_integer);             
18		 IF true
		 THEN
		      DBMS_OUTPUT.PUT_LINE('IF/THEN l_Integer='||l_integer);         
19			 IF true
			 THEN
			      DBMS_OUTPUT.PUT_LINE('IF/THEN l_Integer='||l_integer);         
20			 ELSIF false
			 THEN
				DBMS_OUTPUT.PUT_LINE('ELSIF l_Integer='||l_integer);             
			 ELSE
				DBMS_OUTPUT.PUT_LINE('ELSIF l_Integer='||l_integer);             
			 END IF;
21		 ELSIF false
		 THEN
			DBMS_OUTPUT.PUT_LINE('ELSIF l_Integer='||l_integer);             
22			 IF true
			 THEN
			      DBMS_OUTPUT.PUT_LINE('IF/THEN l_Integer='||l_integer);         
23			 ELSIF false
			 THEN
				DBMS_OUTPUT.PUT_LINE('ELSIF l_Integer='||l_integer);             
			 ELSE
				DBMS_OUTPUT.PUT_LINE('ELSIF l_Integer='||l_integer);             
			 END IF;
		 ELSE
			DBMS_OUTPUT.PUT_LINE('ELSIF l_Integer='||l_integer);             
24			 IF true
			 THEN
			      DBMS_OUTPUT.PUT_LINE('IF/THEN l_Integer='||l_integer);         
25			 ELSIF false
			 THEN
				DBMS_OUTPUT.PUT_LINE('ELSIF l_Integer='||l_integer);             
			 ELSE
				DBMS_OUTPUT.PUT_LINE('ELSIF l_Integer='||l_integer);             
			 END IF;
		 END IF;
	 END IF;
END;								
						
END;
```

[Source](https://pmd.github.io/pmd-5.6.1/pmd-plsql/rules/plsql/codesize.html#CyclomaticComplexity)
