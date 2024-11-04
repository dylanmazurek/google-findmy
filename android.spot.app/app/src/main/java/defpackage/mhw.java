package defpackage;

import java.lang.reflect.Array;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class mhw extends mas {
    public static final Logger d = Logger.getLogger(mhw.class.getName());
    public final mak e;
    public mhr g;
    public lze j;
    public lze k;
    public mrx l;
    private final boolean m;
    public final Map f = new HashMap();
    public int h = 0;
    public boolean i = true;

    public mhw(mak makVar) {
        lze lzeVar = lze.IDLE;
        this.j = lzeVar;
        this.k = lzeVar;
        int i = mic.b;
        this.m = mfh.g("GRPC_EXPERIMENTAL_XDS_DUALSTACK_ENDPOINTS");
        this.e = makVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:            if (r3.size() == 1) goto L18;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.net.SocketAddress h(defpackage.map r3) {
        /*
            mcw r3 = (defpackage.mcw) r3
            mgu r0 = r3.i
            mcf r0 = r0.m
            r0.c()
            boolean r0 = r3.g
            java.lang.String r1 = "not started"
            defpackage.hwx.V(r0, r1)
            java.util.List r3 = r3.e
            r0 = 0
            if (r3 == 0) goto L1d
            int r1 = r3.size()
            r2 = 1
            if (r1 != r2) goto L1d
            goto L1e
        L1d:
            r2 = 0
        L1e:
            java.lang.String r1 = "%s does not have exactly one group"
            defpackage.hwx.X(r2, r1, r3)
            java.lang.Object r3 = r3.get(r0)
            lzn r3 = (defpackage.lzn) r3
            java.util.List r3 = r3.b
            java.lang.Object r3 = r3.get(r0)
            java.net.SocketAddress r3 = (java.net.SocketAddress) r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mhw.h(map):java.net.SocketAddress");
    }

    private final void i() {
        if (this.m) {
            mrx mrxVar = this.l;
            if (mrxVar == null || !mrxVar.b()) {
                try {
                    mak makVar = this.e;
                    mcf c = makVar.c();
                    this.l = c.d(new mgs(this, 2), 250L, TimeUnit.MILLISECONDS, ((mgk) makVar).b.j);
                } catch (NullPointerException unused) {
                }
            }
        }
    }

    @Override // defpackage.mas
    public final mca a(mao maoVar) {
        lze lzeVar;
        mhs mhsVar;
        Boolean bool;
        if (this.j != lze.SHUTDOWN) {
            List list = maoVar.a;
            if (list.isEmpty()) {
                List list2 = maoVar.a;
                lyp lypVar = maoVar.b;
                mca d2 = mca.i.d("NameResolver returned no usable address. addrs=" + String.valueOf(list2) + ", attrs=" + lypVar.toString());
                b(d2);
                return d2;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((lzn) it.next()) == null) {
                    List list3 = maoVar.a;
                    lyp lypVar2 = maoVar.b;
                    mca d3 = mca.i.d("NameResolver returned address list with null endpoint. addrs=" + String.valueOf(list3) + ", attrs=" + lypVar2.toString());
                    b(d3);
                    return d3;
                }
            }
            this.i = true;
            Object obj = maoVar.c;
            if ((obj instanceof mhs) && (bool = (mhsVar = (mhs) obj).a) != null && bool.booleanValue()) {
                ArrayList arrayList = new ArrayList(list);
                Long l = mhsVar.b;
                Collections.shuffle(arrayList, new Random());
                list = arrayList;
            }
            jin jinVar = new jin();
            jinVar.j(list);
            jis g = jinVar.g();
            mhr mhrVar = this.g;
            if (mhrVar == null) {
                this.g = new mhr(g);
            } else if (this.j == lze.READY) {
                SocketAddress c = mhrVar.c();
                this.g.e(g);
                if (this.g.h(c)) {
                    map mapVar = ((mhv) this.f.get(c)).a;
                    mhr mhrVar2 = this.g;
                    mapVar.d(Collections.singletonList(new lzn(mhrVar2.c(), mhrVar2.b())));
                    return mca.b;
                }
                this.g.d();
            } else {
                mhrVar.e(g);
            }
            HashSet<SocketAddress> hashSet = new HashSet(this.f.keySet());
            HashSet hashSet2 = new HashSet();
            int i = ((jmi) g).c;
            for (int i2 = 0; i2 < i; i2++) {
                hashSet2.addAll(((lzn) g.get(i2)).b);
            }
            for (SocketAddress socketAddress : hashSet) {
                if (!hashSet2.contains(socketAddress)) {
                    ((mhv) this.f.remove(socketAddress)).a.b();
                }
            }
            if (hashSet.size() != 0 && (lzeVar = this.j) != lze.CONNECTING && lzeVar != lze.READY) {
                if (lzeVar == lze.IDLE) {
                    f(lze.IDLE, new mhu(this, this));
                } else if (lzeVar == lze.TRANSIENT_FAILURE) {
                    d();
                    e();
                }
            } else {
                lze lzeVar2 = lze.CONNECTING;
                this.j = lzeVar2;
                f(lzeVar2, new mht(mam.a));
                d();
                e();
            }
            return mca.b;
        }
        return mca.g.d("Already shut down");
    }

    @Override // defpackage.mas
    public final void b(mca mcaVar) {
        if (this.j == lze.SHUTDOWN) {
            return;
        }
        Iterator it = this.f.values().iterator();
        while (it.hasNext()) {
            ((mhv) it.next()).a.b();
        }
        this.f.clear();
        mhr mhrVar = this.g;
        if (mhrVar != null) {
            mhrVar.e(null);
        }
        lze lzeVar = lze.TRANSIENT_FAILURE;
        this.j = lzeVar;
        f(lzeVar, new mht(mam.a(mcaVar)));
    }

    @Override // defpackage.mas
    public final void c() {
        d.logp(Level.FINE, "io.grpc.internal.PickFirstLeafLoadBalancer", "shutdown", "Shutting down, currently have {} subchannels created", Integer.valueOf(this.f.size()));
        lze lzeVar = lze.SHUTDOWN;
        this.j = lzeVar;
        this.k = lzeVar;
        d();
        Iterator it = this.f.values().iterator();
        while (it.hasNext()) {
            ((mhv) it.next()).a.b();
        }
        this.f.clear();
    }

    public final void d() {
        mrx mrxVar = this.l;
        if (mrxVar != null) {
            mrxVar.a();
            this.l = null;
        }
    }

    public final void e() {
        map b;
        mhr mhrVar = this.g;
        if (mhrVar != null && mhrVar.g() && this.j != lze.SHUTDOWN) {
            SocketAddress c = this.g.c();
            int i = 1;
            if (this.f.containsKey(c)) {
                b = ((mhv) this.f.get(c)).a;
            } else {
                lyp b2 = this.g.b();
                mhq mhqVar = new mhq(this);
                mak makVar = this.e;
                maf mafVar = new maf();
                lzn[] lznVarArr = {new lzn(c, b2)};
                hwx.D(1, "arraySize");
                ArrayList arrayList = new ArrayList(iqh.o(6L));
                Collections.addAll(arrayList, lznVarArr);
                mafVar.b(arrayList);
                mag magVar = b;
                int i2 = 0;
                while (true) {
                    Object[][] objArr = (Object[][]) mafVar.c;
                    if (i2 < objArr.length) {
                        if (magVar.equals(objArr[i2][0])) {
                            break;
                        } else {
                            i2++;
                        }
                    } else {
                        i2 = -1;
                        break;
                    }
                }
                if (i2 == -1) {
                    Object obj = mafVar.c;
                    int length = ((Object[][]) obj).length;
                    Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, length + 1, 2);
                    System.arraycopy(obj, 0, objArr2, 0, length);
                    mafVar.c = objArr2;
                    i2 = ((Object[][]) mafVar.c).length - 1;
                }
                Object obj2 = mafVar.c;
                Object[] objArr3 = new Object[2];
                objArr3[0] = magVar;
                objArr3[1] = mhqVar;
                ((Object[][]) obj2)[i2] = objArr3;
                b = makVar.b(mafVar.a());
                mhv mhvVar = new mhv(b, lze.IDLE, mhqVar);
                mhqVar.b = mhvVar;
                this.f.put(c, mhvVar);
                if (((mcw) b).a.b.a(mas.c) == null) {
                    mhqVar.a = lzf.a(lze.READY);
                }
                b.c(new mhx(this, b, i));
            }
            int ordinal = ((mhv) this.f.get(c)).b.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal == 3) {
                            b.a();
                            ((mhv) this.f.get(c)).b(lze.CONNECTING);
                            i();
                            return;
                        }
                        return;
                    }
                    this.g.f();
                    e();
                    return;
                }
                d.logp(Level.WARNING, "io.grpc.internal.PickFirstLeafLoadBalancer", "requestConnection", "Requesting a connection even though we have a READY subchannel");
                return;
            }
            if (this.m) {
                i();
            } else {
                b.a();
            }
        }
    }

    public final void f(lze lzeVar, maq maqVar) {
        if (lzeVar == this.k && (lzeVar == lze.IDLE || lzeVar == lze.CONNECTING)) {
            return;
        }
        this.k = lzeVar;
        this.e.e(lzeVar, maqVar);
    }

    public final void g(mhv mhvVar) {
        if (mhvVar.b == lze.READY) {
            lze a = mhvVar.a();
            lze lzeVar = lze.READY;
            if (a != lzeVar) {
                lze a2 = mhvVar.a();
                lze lzeVar2 = lze.TRANSIENT_FAILURE;
                if (a2 == lzeVar2) {
                    f(lzeVar2, new mht(mam.a(mhvVar.c.a.b)));
                    return;
                } else {
                    if (this.k != lzeVar2) {
                        f(mhvVar.a(), new mht(mam.a));
                        return;
                    }
                    return;
                }
            }
            f(lzeVar, new maj(mam.b(mhvVar.a)));
        }
    }
}
