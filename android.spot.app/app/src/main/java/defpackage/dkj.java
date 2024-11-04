package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dkj implements Runnable, Comparable, dkf, dtv {
    private int A;
    public dgr c;
    public dir d;
    public dgs e;
    public int f;
    public int g;
    public dkp h;
    public div i;
    public int j;
    public dir k;
    public volatile dkg l;
    public volatile boolean m;
    public int n;
    public final dks o;
    public dkx p;
    private final buf s;
    private Thread t;
    private dir u;
    private Object v;
    private dje w;
    private volatile boolean x;
    private boolean y;
    private int z;
    public final dkh a = new dkh();
    private final List r = new ArrayList();
    private final iyu B = new iyu();
    public final mep q = new mep();
    public final dki b = new dki();

    public dkj(dks dksVar, buf bufVar) {
        this.o = dksVar;
        this.s = bufVar;
    }

    private final int g() {
        return this.e.ordinal();
    }

    private final dkg h() {
        int i = this.z;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 5) {
                            return null;
                        }
                        throw new IllegalStateException("Unrecognized stage: ".concat(bpy.e(i)));
                    }
                    return new dlk(this.a, this);
                }
                dkh dkhVar = this.a;
                return new dkd(dkhVar.d(), dkhVar, this);
            }
            return new dlg(this.a, this);
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01cc A[LOOP:1: B:85:0x007e->B:128:0x01cc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01d9 A[EDGE_INSN: B:129:0x01d9->B:130:0x01d9 BREAK  A[LOOP:1: B:85:0x007e->B:128:0x01cc], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x003e A[Catch: all -> 0x0206, TryCatch #4 {all -> 0x0206, blocks: (B:77:0x0011, B:80:0x005b, B:132:0x01e0, B:172:0x0202, B:173:0x0205, B:175:0x002a, B:179:0x0034, B:181:0x003e, B:186:0x0048, B:82:0x0065, B:131:0x01db, B:139:0x01fb, B:140:0x0200), top: B:76:0x0011, outer: #14, inners: #1 }] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, dir] */
    /* JADX WARN: Type inference failed for: r7v2, types: [dij, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void i() {
        /*
            Method dump skipped, instructions count: 783
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dkj.i():void");
    }

    private final void j() {
        l();
        dlb dlbVar = new dlb("Failed to load resource", new ArrayList(this.r));
        dkx dkxVar = this.p;
        synchronized (dkxVar) {
            dkxVar.f = dlbVar;
        }
        synchronized (dkxVar) {
            dkxVar.m.a();
            if (dkxVar.i) {
                dkxVar.d();
            } else if (!dkxVar.a.c()) {
                if (!dkxVar.g) {
                    dkxVar.g = true;
                    dir dirVar = dkxVar.b;
                    dkw b = dkxVar.a.b();
                    dkxVar.c(b.a() + 1);
                    dkxVar.l.b(dkxVar, dirVar, null);
                    Iterator it = b.iterator();
                    while (it.hasNext()) {
                        dkv dkvVar = (dkv) it.next();
                        dkvVar.a.execute(new dku(dkxVar, dkvVar.b, 1));
                    }
                    dkxVar.b();
                } else {
                    throw new IllegalStateException("Already failed once");
                }
            } else {
                throw new IllegalStateException("Received an exception without any callbacks to notify");
            }
        }
        if (this.b.c()) {
            a();
        }
    }

    private final void k() {
        this.t = Thread.currentThread();
        SystemClock.elapsedRealtimeNanos();
        boolean z = false;
        while (!this.m && this.l != null && !(z = this.l.c())) {
            this.z = c(this.z);
            this.l = h();
            if (this.z == 4) {
                e(2);
                return;
            }
        }
        if ((this.z == 6 || this.m) && !z) {
            j();
        }
    }

    private final void l() {
        Throwable th;
        this.B.a();
        if (this.x) {
            if (this.r.isEmpty()) {
                th = null;
            } else {
                th = (Throwable) this.r.get(r0.size() - 1);
            }
            throw new IllegalStateException("Already notified", th);
        }
        this.x = true;
    }

    public final void a() {
        this.b.a();
        mep mepVar = this.q;
        mepVar.c = null;
        mepVar.b = null;
        mepVar.a = null;
        dkh dkhVar = this.a;
        dkhVar.c = null;
        dkhVar.d = null;
        dkhVar.m = null;
        dkhVar.g = null;
        dkhVar.j = null;
        dkhVar.h = null;
        dkhVar.n = null;
        dkhVar.i = null;
        dkhVar.o = null;
        dkhVar.a.clear();
        dkhVar.k = false;
        dkhVar.b.clear();
        dkhVar.l = false;
        this.x = false;
        this.c = null;
        this.d = null;
        this.i = null;
        this.e = null;
        this.p = null;
        this.z = 0;
        this.l = null;
        this.t = null;
        this.k = null;
        this.v = null;
        this.A = 0;
        this.w = null;
        this.m = false;
        this.r.clear();
        this.s.b(this);
    }

    @Override // defpackage.dkf
    public final void b(dir dirVar, Exception exc, dje djeVar, int i) {
        djeVar.d();
        dlb dlbVar = new dlb("Fetching data failed", Collections.singletonList(exc));
        dlbVar.b(dirVar, i, djeVar.a());
        this.r.add(dlbVar);
        if (Thread.currentThread() != this.t) {
            e(2);
        } else {
            k();
        }
    }

    public final int c(int i) {
        if (i != 0) {
            int i2 = i - 1;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3 && i2 != 5) {
                            throw new IllegalArgumentException("Unrecognized stage: ".concat(bpy.e(i)));
                        }
                        return 6;
                    }
                    return 4;
                }
                if (this.h.a()) {
                    return 3;
                }
                return c(3);
            }
            if (this.h.b()) {
                return 2;
            }
            return c(2);
        }
        throw null;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        dkj dkjVar = (dkj) obj;
        int g = g() - dkjVar.g();
        if (g == 0) {
            return this.j - dkjVar.j;
        }
        return g;
    }

    @Override // defpackage.dkf
    public final void d(dir dirVar, Object obj, dje djeVar, int i, dir dirVar2) {
        this.k = dirVar;
        this.v = obj;
        this.w = djeVar;
        this.A = i;
        this.u = dirVar2;
        boolean z = false;
        if (dirVar != this.a.d().get(0)) {
            z = true;
        }
        this.y = z;
        if (Thread.currentThread() == this.t) {
            i();
        } else {
            e(3);
        }
    }

    public final void e(int i) {
        this.n = i;
        this.p.a().execute(this);
    }

    @Override // defpackage.dtv
    public final iyu f() {
        return this.B;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        dje djeVar = this.w;
        try {
            try {
                try {
                    if (this.m) {
                        j();
                    } else {
                        int i = this.n;
                        int i2 = i - 1;
                        if (i != 0) {
                            if (i2 != 0) {
                                if (i2 != 1) {
                                    if (i2 != 2) {
                                        if (i != 1) {
                                            if (i != 2) {
                                                str = "DECODE_DATA";
                                            } else {
                                                str = "SWITCH_TO_SOURCE_SERVICE";
                                            }
                                        } else {
                                            str = "INITIALIZE";
                                        }
                                        throw new IllegalStateException("Unrecognized run reason: ".concat(str));
                                    }
                                    i();
                                } else {
                                    k();
                                }
                            } else {
                                this.z = c(1);
                                this.l = h();
                                k();
                            }
                        } else {
                            throw null;
                        }
                    }
                    if (djeVar != null) {
                        djeVar.d();
                    }
                } catch (Throwable th) {
                    if (this.z != 5) {
                        this.r.add(th);
                        j();
                    }
                    if (!this.m) {
                        throw th;
                    }
                    throw th;
                }
            } catch (dkc e) {
                throw e;
            }
        } catch (Throwable th2) {
            if (djeVar != null) {
                djeVar.d();
            }
            throw th2;
        }
    }
}
