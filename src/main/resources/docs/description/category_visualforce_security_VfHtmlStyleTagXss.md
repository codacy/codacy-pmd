Since: PMD 6.31.0

Checks for the correct encoding in `&lt;style/&gt;` tags in Visualforce pages.

The rule is based on Salesforce Security's recommendation to prevent XSS in Visualforce as mentioned
on [Secure Coding Cross Site Scripting](https://developer.salesforce.com/docs/atlas.en-us.secure_coding_guide.meta/secure_coding_guide/secure_coding_cross_site_scripting.htm).

In order to avoid cross site scripting, the relevant encoding must be used in HTML tags. The rule expects
`URLENCODING` or `JSINHTMLENCODING` for URL-based style values and any kind of encoding
(e.g. `HTMLENCODING`) for non-url style values.

See also {% rule &quot;VfUnescapeEl&quot; %} to check escaping in other places on Visualforce pages.

Example(s):
```
<apex:page>
    <style>
        div {
            background: url('{!XSSHere}'); // Potential XSS
        }
        div {
            background: url('{!URLENCODE(XSSHere)}'); // correct encoding
        }
    </style>
</apex:page>
```
