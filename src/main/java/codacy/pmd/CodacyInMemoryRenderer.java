package codacy.pmd;

import net.sourceforge.pmd.Report;
import net.sourceforge.pmd.RuleViolation;
import net.sourceforge.pmd.lang.rule.properties.StringProperty;
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

    public static final String NAME = "codacy";

    public static final StringProperty ENCODING = new StringProperty("encoding",
            "Codacy encoding format, defaults to UTF-8.", "UTF-8", 0);

    public CodacyInMemoryRenderer() {
        super(NAME, "Codacy In Memory.");
        definePropertyDescriptor(ENCODING);
        writer = new Writer() {
            @Override
            public void write(char[] cbuf, int off, int len) throws IOException {

            }

            @Override
            public void flush() throws IOException {

            }

            @Override
            public void close() throws IOException {

            }
        };
    }

    public String defaultFileExtension() {
        return "json";
    }

    private List<RuleViolation> ruleViolations = new LinkedList<>();

    /**
     * {@inheritDoc}
     */
    @Override
    public void start() throws IOException {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void renderFileViolations(Iterator<RuleViolation> violations) throws IOException {
        while (violations.hasNext()) {
            RuleViolation rv = violations.next();
            ruleViolations.add(rv);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void end() throws IOException {
    }

    public List<Report.ProcessingError> getErrors() {
        return errors;
    }

    public List<Report.SuppressedViolation> getSuppressedViolations() {
        return suppressed;
    }

    public List<RuleViolation> getRulesViolations() {
        return ruleViolations;
    }

}
