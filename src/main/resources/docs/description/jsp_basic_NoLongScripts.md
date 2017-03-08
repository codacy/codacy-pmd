Since: PMD 3.6

Scripts should be part of Tag Libraries, rather than part of JSP pages.

Example(s):
```
<HTML>
<BODY>
<!--Java Script-->
<SCRIPT language="JavaScript" type="text/javascript">
<!--
function calcDays(){
  var date1 = document.getElementById('d1').lastChild.data;
  var date2 = document.getElementById('d2').lastChild.data;
  date1 = date1.split("-");
  date2 = date2.split("-");
  var sDate = new Date(date1[0]+"/"+date1[1]+"/"+date1[2]);
  var eDate = new Date(date2[0]+"/"+date2[1]+"/"+date2[2]);
  var daysApart = Math.abs(Math.round((sDate-eDate)/86400000));
  document.getElementById('diffDays').lastChild.data = daysApart;
}

onload=calcDays;
//-->
</SCRIPT>
</BODY>
</HTML>
```

[Source](https://pmd.github.io/pmd-5.5.4/pmd-jsp/rules/jsp/basic.html#NoLongScripts)
