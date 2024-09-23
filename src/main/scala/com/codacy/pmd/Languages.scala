package com.codacy.pmd

object Languages {

  private val languagesAlias = Map(
    "java" -> Set("java"),
    "jsp" -> Set("jsp"),
    "javascript" -> Set("ecmascript"),
    "plsql" -> Set("plsql"),
    "velocity" -> Set("velocity"),
    "xml" -> Set("xml", "pom", "wsdl", "xsl"),
    "apex" -> Set("apex"),
    "swift" -> Set("swift"),
    "kotlin" -> Set("kotlin"),
    "visualforce" -> Set("visualforce")
  )

  val invalidExtensions = Set(".jsx", ".jsm", ".vue")

  def languages: Set[String] = languagesAlias.keySet

  def aliasByLang(name: String): Set[String] = languagesAlias.getOrElse(name.toLowerCase(), Set(name.toLowerCase()))

}
