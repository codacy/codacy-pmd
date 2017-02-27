package codacy.pmd

object Languages {

  private val languagesAlias = Map(
    "java" -> Set("java"),
    "jsp" -> Set("jsp"),
    "javascript" -> Set("ecmascript"),
    "plsql" -> Set("plsql"),
    "velocity" -> Set("vm"),
    "xml" -> Set("xml", "pom", "wsdl", "xsl"),
    "apex" -> Set("apex")
  )

  def languages: Set[String] = languagesAlias.keySet

  def aliasByLang(name: String): Set[String] = languagesAlias.getOrElse(name.toLowerCase(), Set(name.toLowerCase()))

}
