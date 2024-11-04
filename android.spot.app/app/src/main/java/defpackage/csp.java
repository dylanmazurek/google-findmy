package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class csp {
    public final elo a;
    private final long b;
    private final Object c;
    private final Map d;
    private final bet e;

    public csp(bet betVar, elo eloVar) {
        long millis = TimeUnit.MINUTES.toMillis(90L);
        this.e = betVar;
        this.a = eloVar;
        this.b = millis;
        this.c = new Object();
        this.d = new LinkedHashMap();
    }

    public final void a(bet betVar) {
        Runnable runnable;
        betVar.getClass();
        synchronized (this.c) {
            runnable = (Runnable) this.d.remove(betVar);
        }
        if (runnable != null) {
            this.e.r(runnable);
        }
    }

    public final void b(bet betVar) {
        cui cuiVar = new cui(this, betVar, 1);
        synchronized (this.c) {
        }
        this.e.s(this.b, cuiVar);
    }
}
