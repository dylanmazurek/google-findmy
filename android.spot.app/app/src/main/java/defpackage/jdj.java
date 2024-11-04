package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jdj {
    public static final jfk a;

    static {
        jfk jdiVar;
        try {
            SystemClock.elapsedRealtimeNanos();
            jdiVar = new jdh();
        } catch (Throwable unused) {
            SystemClock.elapsedRealtime();
            jdiVar = new jdi();
        }
        a = jdiVar;
    }
}
