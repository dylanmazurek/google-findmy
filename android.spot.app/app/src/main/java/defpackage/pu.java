package defpackage;

import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pu extends iz {
    public static final Executor a = new pt(0);
    private static volatile pu c;
    public final iz b;
    private final iz d;

    private pu() {
        pv pvVar = new pv();
        this.d = pvVar;
        this.b = pvVar;
    }

    public static pu g() {
        if (c == null) {
            synchronized (pu.class) {
                if (c == null) {
                    c = new pu();
                }
            }
        }
        return c;
    }

    public final boolean h() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }
}
