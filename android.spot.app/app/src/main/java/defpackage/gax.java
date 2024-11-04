package defpackage;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gax {
    private static final AtomicInteger a = new AtomicInteger();
    private static final long b;
    private static final jux c;

    static {
        long currentTimeMillis = System.currentTimeMillis() * 1000;
        b = currentTimeMillis;
        SystemClock.elapsedRealtime();
        ljh k = jux.e.k();
        if (!k.b.y()) {
            k.t();
        }
        ljn ljnVar = k.b;
        jux juxVar = (jux) ljnVar;
        juxVar.a |= 2;
        juxVar.c = 0;
        if (!ljnVar.y()) {
            k.t();
        }
        ljn ljnVar2 = k.b;
        jux juxVar2 = (jux) ljnVar2;
        juxVar2.a |= 4;
        juxVar2.d = 0;
        if (!ljnVar2.y()) {
            k.t();
        }
        jux juxVar3 = (jux) k.b;
        juxVar3.a |= 1;
        juxVar3.b = currentTimeMillis;
        c = (jux) k.q();
    }

    public static juw a() {
        ljh k = juw.d.k();
        long andIncrement = a.getAndIncrement();
        if (!k.b.y()) {
            k.t();
        }
        ljn ljnVar = k.b;
        juw juwVar = (juw) ljnVar;
        juwVar.a |= 2;
        juwVar.c = andIncrement;
        jux juxVar = c;
        if (!ljnVar.y()) {
            k.t();
        }
        juw juwVar2 = (juw) k.b;
        juxVar.getClass();
        juwVar2.b = juxVar;
        juwVar2.a |= 1;
        return (juw) k.q();
    }
}
