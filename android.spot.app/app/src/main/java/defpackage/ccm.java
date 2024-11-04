package defpackage;

import android.os.Looper;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ccm {
    private static final ThreadLocal j = new ThreadLocal();
    public cck g;
    public final elo h;
    public final ta a = new ta();
    public final ArrayList b = new ArrayList();
    public final njz i = new njz(this, null);
    public final Runnable c = new nl(this, 18);
    public long d = 0;
    public boolean e = false;
    public float f = 1.0f;

    public ccm(elo eloVar) {
        this.h = eloVar;
    }

    public static ccm a() {
        ThreadLocal threadLocal = j;
        if (threadLocal.get() == null) {
            threadLocal.set(new ccm(new elo((byte[]) null, (byte[]) null, (char[]) null)));
        }
        return (ccm) threadLocal.get();
    }

    public final boolean b() {
        if (Thread.currentThread() == ((Looper) this.h.b).getThread()) {
            return true;
        }
        return false;
    }
}
