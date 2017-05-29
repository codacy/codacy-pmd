package codacy.pmd

object Patterns {

  val timeToFix = Map(
    "apex_complexity_ExcessiveClassLength" -> 1800,
    "apex_complexity_ExcessiveParameterList" -> 60,
    "apex_complexity_ExcessivePublicCount" -> 1800,
    "apex_complexity_NcssConstructorCount" -> 60,
    "apex_complexity_NcssMethodCount" -> 60,
    "apex_complexity_NcssTypeCount" -> 1800,
    "apex_complexity_StdCyclomaticComplexity" -> 1800,
    "apex_complexity_TooManyFields" -> 1800,
    "apex_complexity_AvoidDeeplyNestedIfStmts" -> 360,
    "apex_performance_AvoidSoqlInLoops" -> 360,
    "apex_performance_AvoidDmlStatementsInLoops" -> 360,
    "apex_style_AvoidLogicInTrigger" -> 360,
    "apex_style_AvoidGlobalModifier" -> 10,
    "apex_style_ClassNamingConventions" -> 10,
    "apex_style_MethodNamingConventions" -> 10,
    "apex_style_MethodWithSameNameAsEnclosingClass" -> 10,
    "apex_style_VariableNamingConventions" -> 10,
    "apex_apexunit_ApexUnitTestClassShouldHaveAsserts" -> 60,
    "apex_apexunit_ApexUnitTestShouldNotUseSeeAllDataTrue" -> 360,
    "apex_security_ApexSharingViolations" -> 10,
    "apex_security_ApexInsecureEndpoint" -> 60,
    "apex_security_ApexCSRF" -> 60,
    "apex_security_ApexOpenRedirect" -> 60,
    "apex_security_ApexSOQLInjection" -> 60,
    "apex_security_ApexXSSFromURLParam" -> 60,
    "apex_security_ApexXSSFromEscapeFalse" -> 60,
    "apex_security_ApexBadCrypto" -> 360,
    "apex_security_ApexCRUDViolation" -> 60,
    "apex_security_ApexDangerousMethods" -> 60,
    "apex_security_ApexSuggestUsingNamedCred" -> 60,
    "apex_braces_IfStmtsMustUseBraces" -> 10,
    "apex_braces_WhileLoopsMustUseBraces" -> 10,
    "apex_braces_IfElseStmtsMustUseBraces" -> 10,
    "apex_braces_ForLoopsMustUseBraces" -> 10
  )

}
