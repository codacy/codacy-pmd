Since: PMD 6.7.0

In case you have loops please name the loop variables more meaningful.

Example(s):
```
-- good example
BEGIN
FOR company IN (SELECT * FROM companies) LOOP
  FOR contact IN (SELECT * FROM contacts) LOOP
    FOR party IN (SELECT * FROM parties) LOOP
      NULL;
    END LOOP;
  END LOOP;
END LOOP;
END;
/

-- bad example
BEGIN
FOR c1 IN (SELECT * FROM companies) LOOP
  FOR c2 IN (SELECT * FROM contacts) LOOP
    FOR c3 IN (SELECT * FROM parties) LOOP
      NULL;
    END LOOP;
  END LOOP;
END LOOP;
END;
/
```
