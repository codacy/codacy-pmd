Since: PMD 5.1

Excessive class file lengths are usually indications that the class may be burdened with excessive 
responsibilities that could be provided by external classes or functions. In breaking these methods
apart the code becomes more managable and ripe for reuse.

Example(s):
```
CREATE OR REPLACE
PACKAGE Foo AS
	PROCEDURE bar1 ;
	PROCEDURE bar2 ;
        PROCEDURE bar3 ;
	
    ..
	
        PROCEDURE barN ;
END;
```
