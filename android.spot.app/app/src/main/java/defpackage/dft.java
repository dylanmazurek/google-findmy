package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dft {
    public final Set a;
    public final PriorityBlockingQueue b;
    public final PriorityBlockingQueue c;
    public final dfm[] d;
    public dfi e;
    public final List f;
    public final ddh g;
    public final elo h;
    private final AtomicInteger i;
    private final List j;

    public dft(elo eloVar) {
        ddh ddhVar = new ddh(new Handler(Looper.getMainLooper()));
        this.i = new AtomicInteger();
        this.a = new HashSet();
        this.b = new PriorityBlockingQueue();
        this.c = new PriorityBlockingQueue();
        this.f = new ArrayList();
        this.j = new ArrayList();
        this.h = eloVar;
        this.d = new dfm[4];
        this.g = ddhVar;
    }

    public final void a(dfq dfqVar) {
        dfqVar.g = this;
        synchronized (this.a) {
            this.a.add(dfqVar);
        }
        dfqVar.f = Integer.valueOf(this.i.incrementAndGet());
        int i = dfz.a;
        b();
        this.b.add(dfqVar);
    }

    public final void b() {
        synchronized (this.j) {
            Iterator it = this.j.iterator();
            while (it.hasNext()) {
                ((dfr) it.next()).a();
            }
        }
    }
}
