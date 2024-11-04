package defpackage;

import android.os.SystemClock;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nhk {
    public final long a;
    public final Object b;
    public final Object c;
    public final Object d;

    public nhk(jfe jfeVar, jfe jfeVar2, mko mkoVar) {
        this.a = SystemClock.uptimeMillis();
        this.b = jfeVar;
        this.d = jfeVar2;
        this.c = mkoVar;
    }

    public final boolean a(nfi nfiVar, nhg nhgVar, List list, boolean z) {
        Iterator it = ((ConcurrentLinkedQueue) this.d).iterator();
        while (it.hasNext()) {
            nhi nhiVar = (nhi) it.next();
            nhiVar.getClass();
            synchronized (nhiVar) {
                if (z) {
                    if (!nhiVar.i()) {
                        continue;
                    }
                }
                if (nhiVar.h(nfiVar, list)) {
                    nhgVar.d(nhiVar);
                    return true;
                }
            }
        }
        return false;
    }

    public nhk(ngy ngyVar, TimeUnit timeUnit) {
        ngyVar.getClass();
        this.a = timeUnit.toNanos(5L);
        this.b = ngyVar.a();
        this.c = new nhj(this, String.valueOf(ngt.e).concat(" ConnectionPool"));
        this.d = new ConcurrentLinkedQueue();
    }
}
