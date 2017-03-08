Since: PMD 3.6

Failing to pre-size a StringBuffer or StringBuilder properly could cause it to re-size many times
during runtime. This rule attempts to determine the total number the characters that are actually 
passed into StringBuffer.append(), but represents a best guess "worst case" scenario. An empty
StringBuffer/StringBuilder constructor initializes the object to 16 characters. This default
is assumed if the length of the constructor can not be determined.

Example(s):
```
StringBuffer bad = new StringBuffer();
bad.append("This is a long string that will exceed the default 16 characters");
        
StringBuffer good = new StringBuffer(41);
good.append("This is a long string, which is pre-sized");
```

[Source](https://pmd.github.io/pmd-5.5.4/pmd-java/rules/java/strings.html#InsufficientStringBufferDeclaration)
