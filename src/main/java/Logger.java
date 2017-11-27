
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.SimpleFormatter;

/*
 * Author: Ciarán O'Brien
 * Lecture: Bennard Humm
 */
/**
 *
 * @author Ciaran
 */
public class Logger {

    private static java.util.logging.Logger LOG;
    private static FileHandler fh = null;
    SimpleFormatter sf;

    /**
     *
     * @param filePath
     * @throws java.io.IOException
     */
    public Logger(String filePath) throws IOException {
        try {
            LOG = java.util.logging.Logger.getLogger(Logger.class.getName());
            sf = new SimpleFormatter();
            fh = new FileHandler(filePath, false);
            fh.setFormatter(sf);
            LOG.addHandler(fh);
        } catch (SecurityException | IOException e) {
            e.getMessage();
        }
    }

    public static void LogMessage(String logMessage) {
        LOG.log(Level.WARNING, logMessage);
    }

}
