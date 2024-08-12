Since: PMD 5.0

The God Class rule detects the God Class design flaw using metrics. God classes do too many things,
are very big and overly complex. They should be split apart to be more object-oriented.
The rule uses the detection strategy described in &quot;Object-Oriented Metrics in Practice&quot;.
The violations are reported against the entire class.

The rule uses metrics to implement its detection strategy. The violation message
gives information about the values of these metrics:
* WMC: a class complexity measure, see {% jdoc java::lang.java.metrics.JavaMetrics#WEIGHED_METHOD_COUNT %}
* ATFD: a measure of how much data external data the class uses, see {% jdoc java::lang.java.metrics.JavaMetrics#ACCESS_TO_FOREIGN_DATA %}
* TCC: a measure of how tightly related the methods are, see {% jdoc java::lang.java.metrics.JavaMetrics#TIGHT_CLASS_COHESION %}

The rule identifies a god class by looking for classes which have all of the following properties:
* High WMC
* High ATFD
* Low TCC

See also the reference:

Michele Lanza and Radu Marinescu. *Object-Oriented Metrics in Practice:
Using Software Metrics to Characterize, Evaluate, and Improve the Design
of Object-Oriented Systems.* Springer, Berlin, 1 edition, October 2006. Page 80.

Example(s):
```

```
