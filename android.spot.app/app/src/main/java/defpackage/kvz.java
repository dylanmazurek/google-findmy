package defpackage;

import java.io.InputStream;
import java.net.SocketAddress;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class kvz implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public kvz(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj2;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [lzb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v171, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.util.List, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        mhf mhfVar;
        boolean z;
        int i = 0;
        boolean z2 = false;
        switch (this.c) {
            case 0:
                ((kwa) this.b).a.f(this.a);
                return;
            case 1:
                ((kwa) this.b).a.S((mbc) this.a);
                return;
            case 2:
                ((mek) this.b).g(mca.e.d(((StringBuilder) this.a).toString()), true);
                return;
            case 3:
                mca mcaVar = (mca) this.b;
                ((mek) this.a).b.c(mcaVar.m, mcaVar.n);
                return;
            case 4:
                ((mek) this.b).b.f(this.a);
                return;
            case 5:
                ((mej) this.a).c.S((mbc) this.b);
                return;
            case 6:
                ((mej) this.b).c.f(this.a);
                return;
            case 7:
                ((meo) this.a).e.u(this.b);
                return;
            case 8:
                ((meo) this.a).e.k((lzm) this.b);
                return;
            case 9:
                ((meo) this.a).e.j((lzj) this.b);
                return;
            case 10:
                ((meo) this.b).e.v((InputStream) this.a);
                return;
            case 11:
                ((meo) this.a).e.h((mca) this.b);
                return;
            case 12:
                ((men) this.b).a.e((lrs) this.a);
                return;
            case 13:
                ((men) this.a).a.c((mbc) this.b);
                return;
            case 14:
                ?? r0 = this.a;
                mfs mfsVar = ((mfv) this.b).g;
                SocketAddress a = mfsVar.a();
                mfsVar.a = r0;
                mfsVar.b();
                ((mfv) this.b).h = this.a;
                if (((mfv) this.b).o.a == lze.READY || ((mfv) this.b).o.a == lze.CONNECTING) {
                    Object obj = this.b;
                    while (true) {
                        mfs mfsVar2 = ((mfv) obj).g;
                        if (i < mfsVar2.a.size()) {
                            int indexOf = ((lzn) mfsVar2.a.get(i)).b.indexOf(a);
                            if (indexOf == -1) {
                                i++;
                            } else {
                                mfsVar2.b = i;
                                mfsVar2.c = indexOf;
                            }
                        } else if (((mfv) this.b).o.a == lze.READY) {
                            mfv mfvVar = (mfv) this.b;
                            mhfVar = mfvVar.n;
                            mfvVar.n = null;
                            ((mfv) this.b).g.b();
                            ((mfv) this.b).b(lze.IDLE);
                        } else {
                            ((mfv) this.b).m.e(mca.i.d("InternalSubchannel closed pending transport due to address change"));
                            mfv.h((mfv) this.b);
                            ((mfv) this.b).g.b();
                            ((mfv) this.b).g();
                        }
                    }
                }
                mhfVar = null;
                if (mhfVar != null) {
                    mfv mfvVar2 = (mfv) this.b;
                    if (mfvVar2.s != null) {
                        mfvVar2.j.e(mca.i.d("InternalSubchannel closed transport early due to address change"));
                        ((mfv) this.b).s.a();
                        mfv mfvVar3 = (mfv) this.b;
                        mfvVar3.s = null;
                        mfvVar3.j = null;
                    }
                    mfv mfvVar4 = (mfv) this.b;
                    mfvVar4.j = mhfVar;
                    mfvVar4.s = mfvVar4.f.d(new meg(this, 14), 5L, TimeUnit.SECONDS, mfvVar4.b);
                    return;
                }
                return;
            case 15:
                if (((mfv) this.a).o.a != lze.SHUTDOWN) {
                    mfv mfvVar5 = (mfv) this.a;
                    mfvVar5.p = (mca) this.b;
                    mhf mhfVar2 = mfvVar5.n;
                    meb mebVar = mfvVar5.m;
                    mfvVar5.n = null;
                    mfv.h((mfv) this.a);
                    ((mfv) this.a).b(lze.SHUTDOWN);
                    ((mfv) this.a).g.b();
                    if (((mfv) this.a).k.isEmpty()) {
                        ((mfv) this.a).e();
                    }
                    mfv mfvVar6 = (mfv) this.a;
                    mfvVar6.f.c();
                    mrx mrxVar = mfvVar6.r;
                    if (mrxVar != null) {
                        mrxVar.a();
                        mfvVar6.r = null;
                        mfvVar6.q = null;
                    }
                    mrx mrxVar2 = ((mfv) this.a).s;
                    if (mrxVar2 != null) {
                        mrxVar2.a();
                        ((mfv) this.a).j.e((mca) this.b);
                        mfv mfvVar7 = (mfv) this.a;
                        mfvVar7.s = null;
                        mfvVar7.j = null;
                    }
                    if (mhfVar2 != null) {
                        mhfVar2.e((mca) this.b);
                    }
                    if (mebVar != null) {
                        mebVar.e((mca) this.b);
                        return;
                    }
                    return;
                }
                return;
            case 16:
                ((mfv) this.a).l.c(this.b, false);
                return;
            case 17:
                if (((mft) this.a).c.o.a != lze.SHUTDOWN) {
                    mft mftVar = (mft) this.a;
                    meb mebVar2 = mftVar.a;
                    if (mftVar.c.n == mebVar2) {
                        mftVar.c.n = null;
                        ((mft) this.a).c.g.b();
                        ((mft) this.a).c.b(lze.IDLE);
                        return;
                    }
                    mfv mfvVar8 = mftVar.c;
                    if (mfvVar8.m == mebVar2) {
                        if (mfvVar8.o.a == lze.CONNECTING) {
                            z = true;
                        } else {
                            z = false;
                        }
                        hwx.X(z, "Expected state is CONNECTING, actual state is %s", ((mft) this.a).c.o.a);
                        mfs mfsVar3 = ((mft) this.a).c.g;
                        lzn lznVar = (lzn) mfsVar3.a.get(mfsVar3.b);
                        int i2 = mfsVar3.c + 1;
                        mfsVar3.c = i2;
                        if (i2 >= lznVar.b.size()) {
                            mfsVar3.b++;
                            mfsVar3.c = 0;
                        }
                        mfs mfsVar4 = ((mft) this.a).c.g;
                        if (mfsVar4.b >= mfsVar4.a.size()) {
                            mfv.h(((mft) this.a).c);
                            ((mft) this.a).c.g.b();
                            Object obj2 = this.a;
                            Object obj3 = this.b;
                            mfv mfvVar9 = ((mft) obj2).c;
                            mfvVar9.f.c();
                            mca mcaVar2 = (mca) obj3;
                            hwx.K(!mcaVar2.f(), "The error status must not be OK");
                            mfvVar9.d(new lzf(lze.TRANSIENT_FAILURE, mcaVar2));
                            if (mfvVar9.q == null) {
                                mfvVar9.q = new mev();
                            }
                            long a2 = mfvVar9.q.a() - mfvVar9.i.a(TimeUnit.NANOSECONDS);
                            mfvVar9.d.b(2, "TRANSIENT_FAILURE ({0}). Will reconnect after {1} ns", mfv.j(mcaVar2), Long.valueOf(a2));
                            if (mfvVar9.r == null) {
                                z2 = true;
                            }
                            hwx.V(z2, "previous reconnectTask is not done");
                            mfvVar9.r = mfvVar9.f.d(new meg(mfvVar9, 12), a2, TimeUnit.NANOSECONDS, mfvVar9.b);
                            return;
                        }
                        ((mft) this.a).c.g();
                        return;
                    }
                    return;
                }
                return;
            case 18:
                mgm mgmVar = (mgm) this.a;
                mgu mguVar = mgmVar.c;
                Logger logger = mgu.a;
                Level level = Level.WARNING;
                lzz lzzVar = mguVar.h;
                Object obj4 = this.b;
                logger.logp(level, "io.grpc.internal.ManagedChannelImpl$NameResolverListener", "handleErrorInSyncContext", "[{0}] Failed to resolve name. status={1}", new Object[]{lzzVar, obj4});
                mgq mgqVar = mgmVar.c.H;
                if (mgqVar.a.get() == mgu.e) {
                    mgqVar.d(null);
                }
                mgu mguVar2 = mgmVar.c;
                if (mguVar2.Q != 3) {
                    mguVar2.F.b(3, "Failed to resolve name: {0}", obj4);
                    mgmVar.c.Q = 3;
                }
                mgk mgkVar = mgmVar.a;
                if (mgkVar != mgmVar.c.t) {
                    return;
                }
                mgkVar.a.b.b((mca) obj4);
                return;
            case 19:
                if (((mgq) this.a).a.get() == mgu.e) {
                    mgu mguVar3 = ((mgq) this.a).c;
                    if (mguVar3.w == null) {
                        mguVar3.w = new LinkedHashSet();
                        mgu mguVar4 = ((mgq) this.a).c;
                        mguVar4.O.c(mguVar4.x, true);
                    }
                    ((mgq) this.a).c.w.add(this.b);
                    return;
                }
                ((mgp) this.b).j();
                return;
            default:
                this.a.run();
                Object obj5 = this.b;
                ((mgp) obj5).f.c.m.execute(new mgs(obj5, 1));
                return;
        }
    }

    public kvz(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj2;
        this.a = obj;
    }

    public /* synthetic */ kvz(kwa kwaVar, Object obj, int i) {
        this.c = i;
        this.b = kwaVar;
        this.a = obj;
    }
}
