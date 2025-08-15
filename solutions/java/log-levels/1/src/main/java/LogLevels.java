public class LogLevels {
    
    public static String message(String logLine) {
        String[] parts = logLine.split(":",2);
        return parts[1].trim();
    }

    public static String logLevel(String logLine) {
        String regex = "[\\[\\]]";
        String[] parts = logLine.split(regex);
        return parts[1].toLowerCase();
    }

    public static String reformat(String logLine) {
        return LogLevels.message(logLine)+" ("+LogLevels.logLevel(logLine)+")";
    }
}
