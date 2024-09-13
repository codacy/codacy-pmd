package com.codacy.pmd;

import net.sourceforge.pmd.reporting.Report.ProcessingError;
import net.sourceforge.pmd.reporting.RuleViolation;
import net.sourceforge.pmd.reporting.Report.SuppressedViolation;
import net.sourceforge.pmd.renderers.AbstractIncrementingRenderer;

import java.io.IOException;
import java.io.Writer;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Codacy In Memory Renderer.
 */
public class CodacyInMemoryRenderer extends AbstractIncrementingRenderer {

    private static final String NAME = "codacy";

    private List<RuleViolation> ruleViolations = new LinkedList<>();

    public CodacyInMemoryRenderer() {
        super(NAME, "Codacy In Memory.");
        // Using a stub writer since we are saving the violations in memory
        new Writer() {
            @Override
            public void write(char[] cbuf, int off, int len) throws IOException {
                // Ignore
            }

            @Override
            public void flush() throws IOException {
                // Ignore
            }

            @Override
            public void close() throws IOException {
                // Ignore
            }
        };
    }

    public List<ProcessingError> getErrors() {
        return errors;
    }

    public List<SuppressedViolation> getSuppressedViolations() {
        return suppressed;
    }

    public List<RuleViolation> getRulesViolations() {
        return ruleViolations;
    }

    public String defaultFileExtension() {
        return "json";
    }

    @Override
    public void start() throws IOException {
        ruleViolations.clear();
    }

    @Override
    public void renderFileViolations(Iterator<RuleViolation> violations) throws IOException {
        while (violations.hasNext()) {
            RuleViolation rv = violations.next();
            // Check if there's already a violation with the same rule, line, and file
            boolean isDuplicate = ruleViolations.stream().anyMatch(existingViolation ->
                existingViolation.getBeginLine() == rv.getBeginLine() &&
                existingViolation.getRule().getName().equals(rv.getRule().getName()) &&
                existingViolation.getFileId().equals(rv.getFileId())
            );
            
            if (!isDuplicate) {
                ruleViolations.add(rv);
            }
        }
    }
    

    @Override
    public void end() throws IOException {
        // Ignore
    }

}
