package codacy.pmdjava

private[pmdjava] object RuleSets extends Enumeration {
  type RuleSets = Value
  val android,
  basic,
  braces,
  codesize,
  comments,
  controversial,
  coupling,
  design,
  empty,
  finalizers,
  imports,
  j2ee,
  junit,
  javabeans,
  migrating,
  naming,
  optimizations,
  strictexception,
  strings,
  sunsecure,
  typeresolution,
  unnecessary,
  unusedcode = Value

  val loggingJava = Value("logging-java")
  val loggingJakartaCommons = Value("logging-jakarta-commons")
  val clone_ = Value("clone")

  private[this] lazy val RuleNameToSet = {
    Map(
      "Android" -> android,
      "Basic" -> basic,
      "Braces" -> braces,
      "Clone Implementation" -> clone_,
      "Code Size" -> codesize,
      "Comments" -> comments,
      "Controversial" -> controversial,
      "Coupling" -> coupling,
      "Design" -> design,
      "Empty Code" -> empty,
      "Finalizer" -> finalizers,
      "Import Statements" -> imports,
      "J2EE" -> j2ee,
      "JUnit" -> junit,
      "JavaBeans" -> javabeans,
      "Jakarta Commons Logging" -> loggingJakartaCommons,
      "Java Logging" -> loggingJava,
      "Migration" -> migrating,
      "Migration13" -> migrating,
      "Migration14" -> migrating,
      "Migration15" -> migrating,
      "MigratingToJUnit4" -> migrating,
      "Naming" -> naming,
      "Optimization" -> optimizations,
      "Strict Exceptions" -> strictexception,
      "String and StringBuffer" -> strings,
      "Security Code Guidelines" -> sunsecure,
      "Type Resolution" -> typeresolution,
      "Unnecessary" -> unnecessary,
      "Unused Code" -> unusedcode
    )
  }

  def byRuleSetName = RuleNameToSet.get _
}
