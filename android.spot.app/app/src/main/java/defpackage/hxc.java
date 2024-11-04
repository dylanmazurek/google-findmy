package defpackage;

import android.util.Log;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hxc {
    public static final hnu j = new hnu((byte[]) null);
    public final hvq b;
    public final String c;
    public final bqm g;
    private final Set k;
    public final Object a = new Object();
    public final String d = "";
    public final boolean e = false;
    public final boolean f = false;
    public volatile kpb h = null;
    public final hnu i = new hnu();

    public hxc(hvq hvqVar, String str, boolean z, Set set) {
        this.b = hvqVar;
        this.c = str;
        this.k = set;
        this.g = new bqm(hvqVar, str, "", z);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0096 A[Catch: all -> 0x0125, TryCatch #0 {, blocks: (B:6:0x0009, B:8:0x000d, B:10:0x0027, B:13:0x0036, B:15:0x004d, B:16:0x0053, B:18:0x005b, B:20:0x0065, B:21:0x0120, B:22:0x007f, B:24:0x0096, B:25:0x00a6, B:27:0x00b2, B:29:0x00ba, B:30:0x00bf, B:31:0x00e2, B:33:0x00e8, B:36:0x00fd, B:41:0x0110, B:42:0x009b, B:43:0x0051, B:44:0x0123), top: B:5:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e8 A[Catch: all -> 0x0125, TryCatch #0 {, blocks: (B:6:0x0009, B:8:0x000d, B:10:0x0027, B:13:0x0036, B:15:0x004d, B:16:0x0053, B:18:0x005b, B:20:0x0065, B:21:0x0120, B:22:0x007f, B:24:0x0096, B:25:0x00a6, B:27:0x00b2, B:29:0x00ba, B:30:0x00bf, B:31:0x00e2, B:33:0x00e8, B:36:0x00fd, B:41:0x0110, B:42:0x009b, B:43:0x0051, B:44:0x0123), top: B:5:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009b A[Catch: all -> 0x0125, TryCatch #0 {, blocks: (B:6:0x0009, B:8:0x000d, B:10:0x0027, B:13:0x0036, B:15:0x004d, B:16:0x0053, B:18:0x005b, B:20:0x0065, B:21:0x0120, B:22:0x007f, B:24:0x0096, B:25:0x00a6, B:27:0x00b2, B:29:0x00ba, B:30:0x00bf, B:31:0x00e2, B:33:0x00e8, B:36:0x00fd, B:41:0x0110, B:42:0x009b, B:43:0x0051, B:44:0x0123), top: B:5:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final defpackage.kpb e() {
        /*
            Method dump skipped, instructions count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hxc.e():kpb");
    }

    public final jyz a() {
        String t = e().t();
        if (ivc.o(t)) {
            return jyv.a;
        }
        return jwb.h(this.b.f().c(t), hwf.class, new hxj(this, 1), this.b.b());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object b(String str) {
        return ((jiy) e().b).get(str);
    }

    public final void c() {
        bqm bqmVar = this.g;
        jyz a = bqmVar.a(this.d);
        jwu.h(a, new eji(bqmVar, 20), this.b.b()).c(new hka(this, a, 9), this.b.b());
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.Map, java.lang.Object] */
    public final /* synthetic */ void d(jyz jyzVar) {
        try {
            kpb kpbVar = new kpb((hxw) ivc.M(jyzVar), (hwo) null);
            synchronized (this.a) {
                if (this.h != null) {
                    boolean F = hzc.F(this.h.b, kpbVar.b);
                    if (!F) {
                        this.b.d().a();
                        return;
                    }
                } else {
                    this.h = kpbVar;
                }
                ((AtomicInteger) this.i.a).incrementAndGet();
            }
        } catch (CancellationException | ExecutionException e) {
            if (!(e.getCause() instanceof SecurityException)) {
                Log.w("MobStoreFlagStore", "Unable to update local snapshot for " + this.c + ", may result in stale flags.", e);
            }
        }
    }
}
