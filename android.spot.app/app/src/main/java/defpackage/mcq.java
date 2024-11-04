package defpackage;

import java.net.InetSocketAddress;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mcq implements meb {
    public final String a;
    public mhe b;
    public final Object c = new Object();
    public final Set d = Collections.newSetFromMap(new IdentityHashMap());
    public final Executor e;
    public final int f;
    public final mjz g;
    public lyp h;
    public final mcl i;
    public boolean j;
    public mca k;
    public boolean l;
    private final lzz m;
    private final InetSocketAddress n;
    private final String o;
    private boolean p;
    private boolean q;

    public mcq(mcl mclVar, InetSocketAddress inetSocketAddress, String str, String str2, lyp lypVar, Executor executor, int i, mjz mjzVar) {
        inetSocketAddress.getClass();
        this.n = inetSocketAddress;
        this.m = lzz.a(getClass(), inetSocketAddress.toString());
        this.o = str;
        StringBuilder sb = new StringBuilder();
        if (str2 != null) {
            sb.append(str2);
            sb.append(' ');
        }
        sb.append("grpc-java-cronet/1.66.0-SNAPSHOT");
        this.a = sb.toString();
        this.f = i;
        this.e = executor;
        this.i = mclVar;
        this.g = mjzVar;
        lyp lypVar2 = lyp.a;
        lyn lynVar = new lyn(lyp.a);
        lynVar.b(mfd.a, mbv.PRIVACY_AND_INTEGRITY);
        lynVar.b(mfd.b, lypVar);
        this.h = lynVar.a();
    }

    @Override // defpackage.mdt
    public final /* bridge */ /* synthetic */ mdq a(mbg mbgVar, mbc mbcVar, lys lysVar, lyy[] lyyVarArr) {
        String str = "https://" + this.o + "/".concat(mbgVar.b);
        lyp lypVar = this.h;
        mjt mjtVar = new mjt(lyyVarArr);
        for (lyy lyyVar : lyyVarArr) {
            lyyVar.e(lypVar);
        }
        return new mcp(this, str, mbcVar, mbgVar, mjtVar, lysVar).a;
    }

    @Override // defpackage.mhf
    public final Runnable b(mhe mheVar) {
        this.b = mheVar;
        synchronized (this.c) {
            this.l = true;
        }
        return new jxe(this, 20, null);
    }

    @Override // defpackage.mad
    public final lzz c() {
        return this.m;
    }

    public final void d(mco mcoVar, mca mcaVar) {
        synchronized (this.c) {
            if (this.d.remove(mcoVar)) {
                mbx mbxVar = mcaVar.l;
                boolean z = true;
                if (mbxVar != mbx.CANCELLED && mbxVar != mbx.DEADLINE_EXCEEDED) {
                    z = false;
                }
                mcoVar.p.e(mcaVar, z, new mbc());
                f();
            }
        }
    }

    @Override // defpackage.mhf
    public final void e(mca mcaVar) {
        synchronized (this.c) {
            if (this.j) {
                return;
            }
            synchronized (this.c) {
                if (this.p) {
                    return;
                }
                this.p = true;
                mhe mheVar = this.b;
                mft mftVar = (mft) mheVar;
                mftVar.c.d.b(2, "{0} SHUTDOWN with {1}", mftVar.a.c(), mfv.j(mcaVar));
                mftVar.b = true;
                mftVar.c.f.execute(new kvz(mheVar, mcaVar, 17, null));
                synchronized (this.c) {
                    this.j = true;
                    this.k = mcaVar;
                }
                f();
            }
        }
    }

    final void f() {
        synchronized (this.c) {
            if (this.j && !this.q && this.d.isEmpty()) {
                this.q = true;
                mhe mheVar = this.b;
                mft mftVar = (mft) mheVar;
                hwx.V(mftVar.b, "transportShutdown() must be called before transportTerminated().");
                mftVar.c.d.b(2, "{0} Terminated", mftVar.a.c());
                lzw.b(mftVar.c.c.d, mftVar.a);
                mfv mfvVar = mftVar.c;
                mfvVar.f.execute(new kvz(mfvVar, mftVar.a, 16, null));
                Iterator it = mftVar.c.e.iterator();
                if (!it.hasNext()) {
                    mftVar.c.f.execute(new meg(mheVar, 17));
                } else {
                    throw null;
                }
            }
        }
    }

    public final String toString() {
        InetSocketAddress inetSocketAddress = this.n;
        return super.toString() + "(" + inetSocketAddress.toString() + ")";
    }
}
