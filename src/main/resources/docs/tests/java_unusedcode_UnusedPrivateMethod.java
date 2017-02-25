//#Patterns: java_unusedcode_UnusedPrivateMethod

public class Something {
    //#Warn: java_unusedcode_UnusedPrivateMethod
    private void foo() {
        System.out.print("This private method is NOT called!");
    } // unused

    private void bar() {
        System.out.print("This private method is called!");
    }

    public void doSomething() {
        bar();
    }

    private void verifyWarns(Configuration config, String filePath,
                             String... expected)
            throws Exception {
        verifyWarns(config, filePath, expected, 0);
    }

    private void verifyWarns(Configuration config, String filePath,
                             String[] expected, int warnCountCorrection)
            throws Exception {
        final int tabWidth = Integer.parseInt(config.getAttribute("tabWidth"));
        final IndentComment[] linesWithWarn =
                getLinesWithWarnAndCheckComments(filePath, tabWidth);
        assertEquals("Expected warning count in UT does not match warn"
                        + " comment count in input file", linesWithWarn.length
                        + warnCountCorrection,
                expected.length);
        verify(config, filePath, expected, linesWithWarn);
    }

    @Test
    public void testStrictCondition() throws Exception {
        final DefaultConfiguration checkConfig = createCheckConfig(IndentationCheck.class);
        checkConfig.addAttribute("arrayInitIndent", "4");
        checkConfig.addAttribute("basicOffset", "4");
        checkConfig.addAttribute("braceAdjustment", "4");
        checkConfig.addAttribute("caseIndent", "4");
        checkConfig.addAttribute("forceStrictCondition", "true");
        checkConfig.addAttribute("lineWrappingIndentation", "8");
        checkConfig.addAttribute("tabWidth", "4");
        checkConfig.addAttribute("throwsIndent", "8");
        final String[] expected = CommonUtils.EMPTY_STRING_ARRAY;
        verifyWarns(checkConfig, getPath("InputStrictCondition.java"), expected);
    }
}