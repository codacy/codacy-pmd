Since: PMD 3.9

Individual character values provided as initialization arguments will be converted into integers.
This can lead to internal buffer sizes that are larger than expected. Some examples:

new StringBuffer() 		//  16
new StringBuffer(6)		//  6
new StringBuffer(&quot;hello world&quot;)  // 11 + 16 = 27
new StringBuffer('A')	//  chr(A) = 65
new StringBuffer(&quot;A&quot;)   //  1 + 16 = 17 

new StringBuilder() 		//  16
new StringBuilder(6)		//  6
new StringBuilder(&quot;hello world&quot;)  // 11 + 16 = 27
new StringBuilder('C')	 //  chr(C) = 67
new StringBuilder(&quot;A&quot;)   //  1 + 16 = 17

Example(s):
```
// misleading instantiation, these buffers
	// are actually sized to 99 characters long
StringBuffer  sb1 = new StringBuffer('c');   
StringBuilder sb2 = new StringBuilder('c');
  
// in these forms, just single characters are allocated
StringBuffer  sb3 = new StringBuffer("c");
StringBuilder sb4 = new StringBuilder("c");
```

[Source](https://pmd.github.io/pmd-5.6.1/pmd-java/rules/java/strings.html#StringBufferInstantiationWithChar)
