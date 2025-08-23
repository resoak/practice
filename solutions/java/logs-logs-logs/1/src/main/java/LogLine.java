public class LogLine {
    private String logLine;
    public LogLine(String logLine) {
        this.logLine=logLine;
    }

    public LogLevel getLogLevel() {
        String lvl = logLine.substring(1,4);
        switch(lvl){
            case "TRC": return LogLevel.TRACE;
            case "DBG": return LogLevel.DEBUG;
            case "INF": return LogLevel.INFO;
            case "WRN": return LogLevel.WARNING;
            case "ERR": return LogLevel.ERROR;
            case "FTL": return LogLevel.FATAL;
            default: return LogLevel.UNKNOWN;
        }
    }

    public String getOutputForShortLog() {
        int num = getLogLevel().get_num();
        String logs = logLine.substring(7,logLine.length());
        return String.format("%d:%s",num,logs);
    }
}
