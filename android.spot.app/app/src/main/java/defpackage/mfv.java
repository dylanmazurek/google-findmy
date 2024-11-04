package defpackage;

import j$.util.DesugarCollections;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mfv implements lzy {
    public final mfr a;
    public final ScheduledExecutorService b;
    public final lzw c;
    public final lyu d;
    public final List e;
    public final mcf f;
    public final mfs g;
    public volatile List h;
    public final jfd i;
    public mhf j;
    public meb m;
    public volatile mhf n;
    public mca p;
    public mev q;
    public mrx r;
    public mrx s;
    private final lzz t;
    private final String u;
    private final String v;
    private final mdv w;
    private final mdg x;
    public final Collection k = new ArrayList();
    public final mfl l = new mfn(this);
    public volatile lzf o = lzf.a(lze.IDLE);

    public mfv(List list, String str, String str2, mdv mdvVar, ScheduledExecutorService scheduledExecutorService, mcf mcfVar, mfr mfrVar, lzw lzwVar, mdg mdgVar, lzz lzzVar, lyu lyuVar, List list2) {
        hwx.K(!list.isEmpty(), "addressGroups is empty");
        i(list);
        List unmodifiableList = DesugarCollections.unmodifiableList(new ArrayList(list));
        this.h = unmodifiableList;
        this.g = new mfs(unmodifiableList);
        this.u = str;
        this.v = str2;
        this.w = mdvVar;
        this.b = scheduledExecutorService;
        this.i = new jfd();
        this.f = mcfVar;
        this.a = mfrVar;
        this.c = lzwVar;
        this.x = mdgVar;
        this.t = lzzVar;
        this.d = lyuVar;
        this.e = list2;
    }

    public static /* bridge */ /* synthetic */ void h(mfv mfvVar) {
        mfvVar.m = null;
    }

    public static void i(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            it.next().getClass();
        }
    }

    public static final String j(mca mcaVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(mcaVar.l);
        if (mcaVar.m != null) {
            sb.append("(");
            sb.append(mcaVar.m);
            sb.append(")");
        }
        if (mcaVar.n != null) {
            sb.append("[");
            sb.append(mcaVar.n);
            sb.append("]");
        }
        return sb.toString();
    }

    public final mdt a() {
        mhf mhfVar = this.n;
        if (mhfVar != null) {
            return mhfVar;
        }
        this.f.execute(new meg(this, 13));
        return null;
    }

    public final void b(lze lzeVar) {
        this.f.c();
        d(lzf.a(lzeVar));
    }

    @Override // defpackage.mad
    public final lzz c() {
        return this.t;
    }

    public final void d(lzf lzfVar) {
        boolean z;
        this.f.c();
        if (this.o.a != lzfVar.a) {
            if (this.o.a != lze.SHUTDOWN) {
                z = true;
            } else {
                z = false;
            }
            hwx.V(z, "Cannot transition out of SHUTDOWN to ".concat(lzfVar.toString()));
            this.o = lzfVar;
            mfr mfrVar = this.a;
            hwx.V(true, "listener is null");
            mfrVar.a.a(lzfVar);
        }
    }

    public final void e() {
        this.f.execute(new meg(this, 15));
    }

    public final void f(mca mcaVar) {
        this.f.execute(new kvz(this, mcaVar, 15, null));
    }

    public final void g() {
        boolean z;
        lzs lzsVar;
        this.f.c();
        if (this.r == null) {
            z = true;
        } else {
            z = false;
        }
        hwx.V(z, "Should have no reconnectTask scheduled");
        mfs mfsVar = this.g;
        if (mfsVar.b == 0 && mfsVar.c == 0) {
            jfd jfdVar = this.i;
            jfdVar.c();
            jfdVar.d();
        }
        SocketAddress a = this.g.a();
        if (a instanceof lzs) {
            lzs lzsVar2 = (lzs) a;
            lzsVar = lzsVar2;
            a = lzsVar2.a;
        } else {
            lzsVar = null;
        }
        mfs mfsVar2 = this.g;
        lyp lypVar = ((lzn) mfsVar2.a.get(mfsVar2.b)).c;
        String str = (String) lypVar.a(lzn.a);
        mdu mduVar = new mdu();
        if (str == null) {
            str = this.u;
        }
        str.getClass();
        mduVar.a = str;
        mduVar.b = lypVar;
        mduVar.c = this.v;
        mduVar.d = lzsVar;
        mfu mfuVar = new mfu();
        mfuVar.a = this.t;
        InetSocketAddress inetSocketAddress = (InetSocketAddress) a;
        mck mckVar = (mck) ((mdf) this.w).a;
        mfq mfqVar = new mfq(new mde(new mcq(mckVar.d, inetSocketAddress, mduVar.a, mduVar.c, mduVar.b, mckVar.b, mckVar.c, mckVar.e), mduVar.a), this.x);
        mfuVar.a = mfqVar.c();
        lzw.a(this.c.d, mfqVar);
        this.m = mfqVar;
        this.k.add(mfqVar);
        this.f.b(mfqVar.b(new mft(this, mfqVar)));
        this.d.b(2, "Started transport {0}", mfuVar.a);
    }

    public final String toString() {
        jeq q = ivc.q(this);
        q.e("logId", this.t.a);
        q.b("addressGroups", this.h);
        return q.toString();
    }
}
