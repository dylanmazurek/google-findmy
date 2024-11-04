package defpackage;

import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dso implements dsi {
    private final Object a;
    private final dsm b;
    private final dsk c;
    private final dgr d;
    private final Object e;
    private final Class f;
    private final dsf g;
    private final int h;
    private final int i;
    private final dgs j;
    private final dsw k;
    private final List l;
    private final Executor m;
    private dlf n;
    private long o;
    private volatile dkt p;
    private int q;
    private int r;
    private boolean s;
    private RuntimeException t;
    private kgf w;
    private final iyu v = new iyu();
    private int u = 1;

    public dso(dgr dgrVar, Object obj, Object obj2, Class cls, dsf dsfVar, int i, int i2, dgs dgsVar, dsw dswVar, dsm dsmVar, List list, dsk dskVar, dkt dktVar, Executor executor) {
        this.a = obj;
        this.d = dgrVar;
        this.e = obj2;
        this.f = cls;
        this.g = dsfVar;
        this.h = i;
        this.i = i2;
        this.j = dgsVar;
        this.k = dswVar;
        this.b = dsmVar;
        this.l = list;
        this.c = dskVar;
        this.p = dktVar;
        this.m = executor;
        if (this.t == null && dgrVar.h.d(dgq.class)) {
            this.t = new RuntimeException("Glide request origin trace");
        }
    }

    private static int h(int i, float f) {
        if (i == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return Math.round(f * i);
    }

    private final void i() {
        if (!this.s) {
        } else {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    private final boolean o() {
        dsk dskVar = this.c;
        if (dskVar != null && !dskVar.h(this)) {
            return false;
        }
        return true;
    }

    private final void p() {
        dsk dskVar = this.c;
        if (dskVar != null) {
            dskVar.a().j();
        }
    }

    private final void q() {
        dsf dsfVar = this.g;
        Drawable drawable = dsfVar.g;
        int i = dsfVar.h;
    }

    private final void r(dlb dlbVar) {
        boolean z;
        this.v.a();
        synchronized (this.a) {
            int i = this.d.e;
            Log.w("Glide", "Load failed for [" + String.valueOf(this.e) + "] with dimensions [" + this.q + "x" + this.r + "]", dlbVar);
            List a = dlbVar.a();
            int size = a.size();
            for (int i2 = 0; i2 < size; i2++) {
            }
            this.w = null;
            this.u = 5;
            dsk dskVar = this.c;
            if (dskVar != null) {
                dskVar.d(this);
            }
            boolean z2 = true;
            this.s = true;
            try {
                List<dsm> list = this.l;
                if (list != null) {
                    z = false;
                    for (dsm dsmVar : list) {
                        p();
                        z |= dsmVar.a(dlbVar);
                    }
                } else {
                    z = false;
                }
                dsm dsmVar2 = this.b;
                if (dsmVar2 != null) {
                    p();
                    if (dsmVar2.a(dlbVar)) {
                        if (!(z | z2) && o()) {
                            dsf dsfVar = this.g;
                            Drawable drawable = dsfVar.e;
                            int i3 = dsfVar.f;
                            q();
                            this.k.l();
                        }
                    }
                }
                z2 = false;
                if (!(z | z2)) {
                    dsf dsfVar2 = this.g;
                    Drawable drawable2 = dsfVar2.e;
                    int i32 = dsfVar2.f;
                    q();
                    this.k.l();
                }
            } finally {
                this.s = false;
            }
        }
    }

    public final Object a() {
        this.v.a();
        return this.a;
    }

    @Override // defpackage.dsi
    public final void b() {
        synchronized (this.a) {
            i();
            this.v.a();
            this.o = SystemClock.elapsedRealtimeNanos();
            if (this.e == null) {
                if (dtq.l(this.h, this.i)) {
                    this.q = this.h;
                    this.r = this.i;
                }
                r(new dlb("Received null model"));
                return;
            }
            int i = this.u;
            if (i != 2) {
                if (i == 4) {
                    g(this.n, 5);
                    return;
                }
                List<dsm> list = this.l;
                if (list != null) {
                    for (dsm dsmVar : list) {
                        if (dsmVar instanceof dsh) {
                            throw null;
                        }
                    }
                }
                this.u = 3;
                if (dtq.l(this.h, this.i)) {
                    e(this.h, this.i);
                } else {
                    this.k.e(this);
                }
                int i2 = this.u;
                if ((i2 == 2 || i2 == 3) && o()) {
                    dsw dswVar = this.k;
                    q();
                    dswVar.m();
                }
                return;
            }
            throw new IllegalArgumentException("Cannot restart a running request");
        }
    }

    @Override // defpackage.dsi
    public final void c() {
        synchronized (this.a) {
            i();
            this.v.a();
            if (this.u == 6) {
                return;
            }
            i();
            this.v.a();
            this.k.f(this);
            kgf kgfVar = this.w;
            dlf dlfVar = null;
            if (kgfVar != null) {
                synchronized (kgfVar.a) {
                    ((dkx) kgfVar.c).h((dso) kgfVar.b);
                }
                this.w = null;
            }
            dlf dlfVar2 = this.n;
            if (dlfVar2 != null) {
                this.n = null;
                dlfVar = dlfVar2;
            }
            dsk dskVar = this.c;
            if (dskVar == null || dskVar.g(this)) {
                dsw dswVar = this.k;
                q();
                dswVar.k();
            }
            this.u = 6;
            if (dlfVar != null) {
                ((dkz) dlfVar).f();
            }
        }
    }

    public final void d(dlb dlbVar) {
        r(dlbVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00b7 A[Catch: all -> 0x0169, TryCatch #1 {all -> 0x0169, blocks: (B:16:0x00b7, B:18:0x00c3, B:19:0x0151, B:26:0x00cd, B:31:0x0146, B:35:0x016a, B:37:0x0157, B:41:0x0082, B:43:0x008c, B:45:0x0091, B:49:0x00aa, B:52:0x009b, B:54:0x009f, B:55:0x00a2), top: B:40:0x0082 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0164 A[Catch: all -> 0x016c, TryCatch #2 {, blocks: (B:4:0x000a, B:6:0x000f, B:9:0x0011, B:10:0x007a, B:21:0x015d, B:23:0x0164, B:24:0x0167, B:36:0x016b, B:39:0x0159), top: B:3:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0157 A[Catch: all -> 0x0169, DONT_GENERATE, TRY_LEAVE, TryCatch #1 {all -> 0x0169, blocks: (B:16:0x00b7, B:18:0x00c3, B:19:0x0151, B:26:0x00cd, B:31:0x0146, B:35:0x016a, B:37:0x0157, B:41:0x0082, B:43:0x008c, B:45:0x0091, B:49:0x00aa, B:52:0x009b, B:54:0x009f, B:55:0x00a2), top: B:40:0x0082 }] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v3, types: [buf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v16, types: [buf, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(int r28, int r29) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dso.e(int, int):void");
    }

    @Override // defpackage.dsi
    public final void f() {
        synchronized (this.a) {
            if (n()) {
                c();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0122, code lost:            ((defpackage.dkz) r9).f();     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0127, code lost:            return;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(defpackage.dlf r9, int r10) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dso.g(dlf, int):void");
    }

    @Override // defpackage.dsi
    public final boolean j() {
        boolean z;
        synchronized (this.a) {
            if (this.u == 4) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.dsi
    public final boolean k() {
        boolean z;
        synchronized (this.a) {
            if (this.u == 6) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.dsi
    public final boolean l() {
        boolean z;
        synchronized (this.a) {
            if (this.u == 4) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.dsi
    public final boolean m(dsi dsiVar) {
        int i;
        int i2;
        Object obj;
        Class cls;
        dsf dsfVar;
        dgs dgsVar;
        int i3;
        int i4;
        int i5;
        Object obj2;
        Class cls2;
        dsf dsfVar2;
        dgs dgsVar2;
        int i6;
        boolean equals;
        if (!(dsiVar instanceof dso)) {
            return false;
        }
        synchronized (this.a) {
            i = this.h;
            i2 = this.i;
            obj = this.e;
            cls = this.f;
            dsfVar = this.g;
            dgsVar = this.j;
            List list = this.l;
            if (list != null) {
                i3 = list.size();
            } else {
                i3 = 0;
            }
        }
        dso dsoVar = (dso) dsiVar;
        synchronized (dsoVar.a) {
            i4 = dsoVar.h;
            i5 = dsoVar.i;
            obj2 = dsoVar.e;
            cls2 = dsoVar.f;
            dsfVar2 = dsoVar.g;
            dgsVar2 = dsoVar.j;
            List list2 = dsoVar.l;
            if (list2 != null) {
                i6 = list2.size();
            } else {
                i6 = 0;
            }
        }
        if (i == i4 && i2 == i5) {
            char[] cArr = dtq.a;
            if (obj == null) {
                if (obj2 != null) {
                    return false;
                }
            } else {
                if (obj instanceof dnm) {
                    equals = ((dnm) obj).a();
                } else {
                    equals = obj.equals(obj2);
                }
                if (!equals) {
                    return false;
                }
            }
            if (cls.equals(cls2) && dsfVar.equals(dsfVar2) && dgsVar == dgsVar2 && i3 == i6) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.dsi
    public final boolean n() {
        boolean z;
        synchronized (this.a) {
            int i = this.u;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    public final String toString() {
        Object obj;
        Class cls;
        synchronized (this.a) {
            obj = this.e;
            cls = this.f;
        }
        return super.toString() + "[model=" + String.valueOf(obj) + ", transcodeClass=" + cls.toString() + "]";
    }
}
