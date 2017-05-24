Since: PMD 3.4

Use StringBuffer.length() to determine StringBuffer length rather than using StringBuffer.toString().equals(&quot;&quot;)
or StringBuffer.toString().length() == ...

Example(s):
```
StringBuffer sb = new StringBuffer();
    
if (sb.toString().equals("")) {}	    // inefficient 
    
if (sb.length() == 0) {}	    		// preferred
```
