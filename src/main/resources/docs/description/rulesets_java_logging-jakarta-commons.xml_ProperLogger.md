A logger should normally be defined private static final and be associated with the correct class. Private final Log log; is also allowed for rare cases where loggers need to be passed around, with the restriction that the logger needs to be passed into the constructor.

Ex:

[
  "//ClassOrInterfaceBodyDeclaration[FieldDeclaration//ClassOrInterfaceType[@Image='Log'] and not(FieldDeclaration[@Final='true'][@Static='true'][@Private='true'][.//VariableDeclaratorId[@Image=$staticLoggerName]] //ArgumentList//ClassOrInterfaceType/@Image = ancestor::ClassOrInterfaceDeclaration/@Image) and not(FieldDeclaration[@Final='true'][@Private='true'][.//VariableDeclaratorId[@Image='log']] [count(.//VariableInitializer)=0] [ancestor::ClassOrInterfaceBody//StatementExpression[.//PrimaryExpression/descendant::*[@Image='log']][count(.//AllocationExpression)=0]] )]",
  "public class Foo { private static final Log LOG = LogFactory.getLog(Foo.class); // proper way protected Log LOG = LogFactory.getLog(Testclass.class); // wrong approach }"
]

[SOURCE](https://pmd.github.io/pmd-5.3.3/pmd-java/rules/java/logging-jakarta-commons.html#ProperLogger)
