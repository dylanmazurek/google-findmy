package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nfu {
    private ExecutorService a;
    private final ArrayDeque b = new ArrayDeque();
    private final ArrayDeque c = new ArrayDeque();
    private final ArrayDeque d = new ArrayDeque();

    public final synchronized void a(nhg nhgVar) {
        this.d.add(nhgVar);
    }

    public final void b(nhg nhgVar) {
        ArrayDeque arrayDeque = this.d;
        synchronized (this) {
            if (!arrayDeque.remove(nhgVar)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        byte[] bArr = ngt.a;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator it = this.b.iterator();
            it.getClass();
            if (it.hasNext()) {
                if (this.c.size() < 64) {
                    throw null;
                }
            }
            d();
        }
        if (arrayList.size() <= 0) {
            return;
        }
        c();
        throw null;
    }

    public final synchronized void c() {
        if (this.a == null) {
            this.a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new ngs(String.valueOf(ngt.e).concat(" Dispatcher"), false));
        }
        this.a.getClass();
    }

    public final synchronized void d() {
        this.c.size();
        this.d.size();
    }
}
