package org.hfeng.ch11.ex02;

public class Log {
    private static final ThreadLocal tsLogCollection = new ThreadLocal();

    public static void println(String s) {
        getTSLog().println(s);
    }

    public static void close() {
        getTSLog().close();
    }


    private static TSLog getTSLog() {
        TSLog tsLog = (TSLog) tsLogCollection.get();

        if (tsLog == null) {
            tsLog = new TSLog(Thread.currentThread().getName() + "-log.txt");
            tsLogCollection.set(tsLog);
        }
        return tsLog;
    }
}
