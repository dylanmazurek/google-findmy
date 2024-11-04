package defpackage;

import android.os.Trace;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kj implements Runnable {
    public static final ThreadLocal a = new ThreadLocal();
    static final Comparator b = new kg(0);
    long d;
    public long e;
    public final ArrayList c = new ArrayList();
    private final ArrayList f = new ArrayList();

    private static final mh b(RecyclerView recyclerView, int i, long j) {
        int b2 = recyclerView.h.b();
        for (int i2 = 0; i2 < b2; i2++) {
            mh h = RecyclerView.h(recyclerView.h.e(i2));
            if (h.d == i && !h.q()) {
                return null;
            }
        }
        lw lwVar = recyclerView.e;
        if (j == Long.MAX_VALUE) {
            try {
                if (btf.a()) {
                    Trace.beginSection("RV Prefetch forced - needed next frame");
                }
            } finally {
                recyclerView.N(false);
                Trace.endSection();
            }
        }
        recyclerView.L();
        mh o = lwVar.o(i, j);
        if (o != null) {
            if (o.p() && !o.q()) {
                lwVar.j(o.b);
            } else {
                lwVar.c(o, false);
            }
        }
        return o;
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.r && this.d == 0) {
            this.d = RecyclerView.ak();
            recyclerView.post(this);
        }
        kh khVar = recyclerView.L;
        khVar.a = i;
        khVar.b = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d2, code lost:            continue;     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 399
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kj.run():void");
    }
}
