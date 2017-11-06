Since: PMD 5.1

Excessive class file lengths are usually indications that the class may be burdened with excessive 
responsibilities that could be provided by external classes or functions. In breaking these methods
apart the code becomes more managable and ripe for reuse.

Example(s):
```
CREATE OR REPLACE
TYPE BODY Foo AS
    MEMBER PROCEDURE bar1 IS BEGIN
    -- 1000 lines of code
    END bar1;
    MEMBER PROCEDURE bar2 IS BEGIN
    -- 1000 lines of code
    END bar2;
    MEMBER PROCEDURE bar3 IS BEGIN
    -- 1000 lines of code
    END bar3;


    MEMBER PROCEDURE barN IS BEGIN
    -- 1000 lines of code
    END barn;
END;
```
