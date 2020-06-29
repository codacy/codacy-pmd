Since: PMD 6.25.0

Problem: A Calendar is a heavyweight object and expensive to create.

Solution: Use `new Date()`, Java 8+ `java.time.LocalDateTime.now()` or `ZonedDateTime.now()`.

Example(s):
```
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class DateStuff {
    private Date bad1() {
        return Calendar.getInstance().getTime(); // now
    }
    private Date good1a() {
        return new Date(); // now
    }
    private LocalDateTime good1b() {
        return LocalDateTime.now();
    }
    private long bad2() {
        return Calendar.getInstance().getTimeInMillis();
    }
    private long good2() {
        return System.currentTimeMillis();
    }
}
```
