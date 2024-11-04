package defpackage;

import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mgu extends mav implements lzy {
    public static final Logger a = Logger.getLogger(mgu.class.getName());
    static final mca b;
    static final mca c;
    public static final mhd d;
    public static final lzx e;
    public static final mal f;
    public static final lyv g;
    public final AtomicBoolean A;
    public boolean B;
    public volatile boolean C;
    public final mdg D;
    public final mdi E;
    public final lyu F;
    public final lzw G;
    public final mgq H;
    public mhd I;
    public boolean J;
    public final boolean K;
    public final long L;
    public final long M;
    public final boolean N;
    public final mfl O;
    public final mge P;
    public int Q;
    public final njz R;
    public final ktf S;
    private final String T;
    private final URI U;
    private final mbo V;
    private final mbh W;
    private final mho X;
    private final mgi Y;
    private final mgi Z;
    private final long aa;
    private final lyt ab;
    private volatile maq ac;
    private final Set ad;
    private final CountDownLatch ae;
    private final mhe af;
    private final mil ag;
    private final mrx ah;
    public final lzz h;
    public final mdv i;
    public final mgr j;
    public final Executor k;
    public final mjx l;
    public final mcf m;
    public final lzm n;
    public final mec o;
    public final List p;
    public final String q;
    public mbn r;
    public boolean s;
    public mgk t;
    public boolean u;
    public final Set v;
    public Collection w;
    public final Object x;
    public final mem y;
    public final mgt z;

    static {
        mca.i.d("Channel shutdownNow invoked");
        b = mca.i.d("Channel shutdown invoked");
        c = mca.i.d("Subchannel shutdown invoked");
        d = new mhd(null, new HashMap(), new HashMap(), null, null, null);
        e = new mga();
        f = new mhp();
        g = new mgd();
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [java.util.concurrent.Executor, java.lang.Object] */
    public mgu(mgy mgyVar, mdv mdvVar, URI uri, mbo mboVar, mho mhoVar, jfe jfeVar, List list, mjx mjxVar) {
        boolean z;
        mcf mcfVar = new mcf(new mgc(this, 0));
        this.m = mcfVar;
        this.o = new mec();
        this.v = new HashSet(16, 0.75f);
        this.x = new Object();
        this.ad = new HashSet(1, 0.75f);
        this.z = new mgt(this);
        this.A = new AtomicBoolean(false);
        this.ae = new CountDownLatch(1);
        this.Q = 1;
        this.I = d;
        this.J = false;
        this.S = new ktf((char[]) null, (byte[]) null, (byte[]) null);
        mjo mjoVar = lzj.c;
        mgh mghVar = new mgh(this);
        this.af = mghVar;
        this.O = new mgj(this);
        this.P = new mge(this);
        String str = mgyVar.l;
        str.getClass();
        this.T = str;
        lzz b2 = lzz.b("Channel", str);
        this.h = b2;
        this.l = mjxVar;
        mho mhoVar2 = mgyVar.g;
        mhoVar2.getClass();
        this.X = mhoVar2;
        ?? a2 = mhoVar2.a();
        a2.getClass();
        this.k = a2;
        mho mhoVar3 = mgyVar.h;
        mhoVar3.getClass();
        mgi mgiVar = new mgi(mhoVar3);
        this.Z = mgiVar;
        mdf mdfVar = new mdf(mdvVar, mgiVar);
        this.i = mdfVar;
        new mdf(mdvVar, mgiVar);
        mgr mgrVar = new mgr(mdfVar.a());
        this.j = mgrVar;
        mdi mdiVar = new mdi(b2, mjxVar.a(), "Channel for '" + str + "'");
        this.E = mdiVar;
        mdh mdhVar = new mdh(mdiVar, mjxVar);
        this.F = mdhVar;
        mbu mbuVar = mfh.j;
        boolean z2 = mgyVar.v;
        this.N = z2;
        mrx mrxVar = new mrx(mau.b(), mgyVar.n);
        this.ah = mrxVar;
        this.U = uri;
        this.V = mboVar;
        mbm mbmVar = new mbm(z2, mgyVar.r, mgyVar.s, mrxVar);
        mbuVar.getClass();
        mbh mbhVar = new mbh(443, mbuVar, mcfVar, mbmVar, mgrVar, mdhVar, mgiVar);
        this.W = mbhVar;
        this.r = k(uri, mboVar, mbhVar);
        this.Y = new mgi(mhoVar);
        mem memVar = new mem(a2, mcfVar);
        this.y = memVar;
        memVar.f = mghVar;
        memVar.c = new meg(mghVar, 3);
        memVar.d = new meg(mghVar, 4);
        memVar.e = new meg(mghVar, 5);
        boolean z3 = mgyVar.x;
        this.K = z3;
        mgq mgqVar = new mgq(this, this.r.a());
        this.H = mgqVar;
        this.ab = mjo.J(mgqVar, list);
        this.p = new ArrayList(mgyVar.k);
        jfeVar.getClass();
        long j = mgyVar.q;
        if (j == -1) {
            this.aa = -1L;
        } else {
            if (j >= mgy.c) {
                z = true;
            } else {
                z = false;
            }
            hwx.N(z, "invalid idleTimeoutMillis %s", j);
            this.aa = mgyVar.q;
        }
        this.ag = new mil(new meg(this, 18), mcfVar, mdfVar.a(), new jfd());
        lzm lzmVar = mgyVar.o;
        lzmVar.getClass();
        this.n = lzmVar;
        mgyVar.p.getClass();
        this.q = mgyVar.m;
        this.M = mgyVar.t;
        this.L = mgyVar.u;
        njz njzVar = new njz(mjxVar, null);
        this.R = njzVar;
        this.D = njzVar.c();
        lzw lzwVar = mgyVar.w;
        lzwVar.getClass();
        this.G = lzwVar;
        lzw.a(lzwVar.b, this);
        if (!z3) {
            this.J = true;
        }
        mjo.H();
    }

    static mbn k(URI uri, mbo mboVar, mbh mbhVar) {
        mbn a2 = mboVar.a(uri, mbhVar);
        if (a2 != null) {
            return new mjg(a2, new mdd(mbhVar.d, mbhVar.b), mbhVar.b);
        }
        throw new IllegalArgumentException("cannot create a NameResolver for ".concat(String.valueOf(String.valueOf(uri))));
    }

    @Override // defpackage.lyt
    public final lyv a(mbg mbgVar, lys lysVar) {
        return this.ab.a(mbgVar, lysVar);
    }

    @Override // defpackage.lyt
    public final String b() {
        return this.ab.b();
    }

    @Override // defpackage.mad
    public final lzz c() {
        return this.h;
    }

    public final Executor d(lys lysVar) {
        Executor executor = lysVar.c;
        if (executor == null) {
            return this.k;
        }
        return executor;
    }

    public final void e(boolean z) {
        ScheduledFuture scheduledFuture;
        mil milVar = this.ag;
        milVar.e = false;
        if (z && (scheduledFuture = milVar.f) != null) {
            scheduledFuture.cancel(false);
            milVar.f = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f() {
        this.m.c();
        if (!this.A.get() && !this.u) {
            if (!this.O.a.isEmpty()) {
                e(false);
            } else {
                h();
            }
            if (this.t == null) {
                this.F.a(2, "Exiting idle mode");
                mgk mgkVar = new mgk(this);
                mgkVar.a = new mcy(this.ah, mgkVar);
                this.t = mgkVar;
                this.o.a(lze.CONNECTING);
                this.r.d(new mgm(this, mgkVar, this.r));
                this.s = true;
            }
        }
    }

    public final void g() {
        if (!this.C && this.A.get() && this.v.isEmpty() && this.ad.isEmpty()) {
            this.F.a(2, "Terminated");
            lzw.b(this.G.b, this);
            this.X.b(this.k);
            this.Y.b();
            this.Z.b();
            this.i.close();
            this.C = true;
            this.ae.countDown();
        }
    }

    public final void h() {
        long j = this.aa;
        if (j == -1) {
            return;
        }
        mil milVar = this.ag;
        long nanos = TimeUnit.MILLISECONDS.toNanos(j);
        long a2 = milVar.a() + nanos;
        milVar.e = true;
        if (a2 - milVar.d < 0 || milVar.f == null) {
            ScheduledFuture scheduledFuture = milVar.f;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            milVar.f = milVar.a.schedule(new mgs(milVar, 6), nanos, TimeUnit.NANOSECONDS);
        }
        milVar.d = a2;
    }

    public final void i(boolean z) {
        boolean z2;
        this.m.c();
        if (z) {
            hwx.V(this.s, "nameResolver is not started");
            if (this.t != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            hwx.V(z2, "lbHelper is null");
        }
        mbn mbnVar = this.r;
        if (mbnVar != null) {
            mbnVar.c();
            this.s = false;
            if (z) {
                this.r = k(this.U, this.V, this.W);
            } else {
                this.r = null;
            }
        }
        mgk mgkVar = this.t;
        if (mgkVar != null) {
            mcy mcyVar = mgkVar.a;
            mcyVar.b.c();
            mcyVar.b = null;
            this.t = null;
        }
        this.ac = null;
    }

    public final void j(maq maqVar) {
        this.ac = maqVar;
        this.y.d(maqVar);
    }

    public final String toString() {
        jeq q = ivc.q(this);
        q.e("logId", this.h.a);
        q.b("target", this.T);
        return q.toString();
    }
}
