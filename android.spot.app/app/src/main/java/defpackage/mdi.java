package defpackage;

import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mdi {
    static final Logger a = Logger.getLogger(lyu.class.getName());
    public final Object b = new Object();
    public final lzz c;

    public mdi(lzz lzzVar, long j, String str) {
        lzzVar.getClass();
        this.c = lzzVar;
        lzt lztVar = new lzt();
        lztVar.a = str.concat(" created");
        lztVar.b = lzu.CT_INFO;
        lztVar.b(j);
        b(lztVar.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(lzz lzzVar, Level level, String str) {
        Logger logger = a;
        if (logger.isLoggable(level)) {
            LogRecord logRecord = new LogRecord(level, "[" + lzzVar.toString() + "] " + str);
            logRecord.setLoggerName(logger.getName());
            logRecord.setSourceClassName(logger.getName());
            logRecord.setSourceMethodName("log");
            logger.log(logRecord);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(lzv lzvVar) {
        Level level;
        int ordinal = lzvVar.b.ordinal();
        if (ordinal != 2) {
            if (ordinal != 3) {
                level = Level.FINEST;
            } else {
                level = Level.FINE;
            }
        } else {
            level = Level.FINER;
        }
        synchronized (this.b) {
        }
        a(this.c, level, lzvVar.a);
    }
}
