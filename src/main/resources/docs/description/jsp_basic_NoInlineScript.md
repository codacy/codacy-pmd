Since: PMD 4.0

Avoid inlining HTML script content.  Consider externalizing the HTML script using the 'src' attribute on the &quot;script&quot; element.
Externalized script could be reused between pages.  Browsers can also cache the script, reducing overall download bandwidth.

Example(s):
```
Most browsers should be able to interpret the following headers:
                
                <%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
                    
                <meta http-equiv="Content-Type"  content="text/html; charset=UTF-8" />
```

[Source](https://pmd.github.io/pmd-5.6.1/pmd-jsp/rules/jsp/basic.html#NoInlineScript)
