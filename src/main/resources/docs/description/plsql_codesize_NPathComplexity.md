Since: PMD 5.1

The NPath complexity of a method is the number of acyclic execution paths through that method.
A threshold of 200 is generally considered the point where measures should be taken to reduce 
complexity and increase readability.

Example(s):
```
CREATE OR REPLACE
PROCEDURE bar AS BEGIN	-- this is something more complex than it needs to be,
	if (y) THEN	-- it should be broken down into smaller methods or functions
		for j IN 0 .. j-1 LOOP
			if (j > r) THEN
				doSomething;
				while (f < 5 ) LOOP
					anotherThing;
					f := f - 27;
					END LOOP;
			else
					tryThis();
			END IF;
		END LOOP;
	END IF;
	if ( r - n > 45) THEN
		while (doMagic) LOOP
			findRabbits;
		END LOOP;
	END IF;
	BEGIN
		doSomethingDangerous();
	EXCEPTION WHEN FooException THEN
		makeAmends;
		BEGIN
			dontDoItAgain;
		EXCEPTION
		WHEN OTHERS THEN
				log_problem;
		END;
	END;
END;
```

[Source](https://pmd.github.io/pmd-5.6.1/pmd-plsql/rules/plsql/codesize.html#NPathComplexity)
