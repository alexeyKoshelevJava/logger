import java.util.Date;

public class Logger {
    private static Logger instance = null;

    protected int num = 1;

    private Logger() {
    }


    public void log(String msg) {
        Date date = new Date();
        System.out.println("[" + date + " № " + num + "] " + msg);
        num++;


    }

    public static Logger getInstance() {
        if (instance == null) instance = new Logger();
        return instance;
    }
}