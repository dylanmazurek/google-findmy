package defpackage;

import java.text.MessageFormat;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mdh extends lyu {
    private final mdi a;

    public mdh(mdi mdiVar, mjx mjxVar) {
        mdiVar.getClass();
        this.a = mdiVar;
        mjxVar.getClass();
    }

    public static Level c(int i) {
        int i2 = i - 1;
        if (i2 != 1) {
            if (i2 != 2 && i2 != 3) {
                return Level.FINEST;
            }
            return Level.FINE;
        }
        return Level.FINER;
    }

    private final void d(int i) {
        if (i != 1) {
            synchronized (this.a.b) {
            }
        }
    }

    @Override // defpackage.lyu
    public final void a(int i, String str) {
        Level c = c(i);
        if (mdi.a.isLoggable(c)) {
            mdi.a(this.a.c, c, str);
        }
        d(i);
    }

    @Override // defpackage.lyu
    public final void b(int i, String str, Object... objArr) {
        String str2;
        Level c = c(i);
        d(i);
        if (mdi.a.isLoggable(c)) {
            str2 = MessageFormat.format(str, objArr);
        } else {
            str2 = null;
        }
        a(i, str2);
    }
}
