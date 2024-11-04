package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class etb {
    public static final jnk a = jnk.l("com/google/android/apps/adm/integrations/spot/sharing/PendingDevicesSharingValidationCodeStateImpl");
    public final ewg b;
    public final Executor c;
    public final Executor d;
    public final dxf g;
    public final ihk h;
    private final ele j;
    public final Object e = new Object();
    private boolean k = false;
    private jyz l = null;
    public final Map f = new HashMap();
    public final dhx i = new dhx((short[]) null);

    public etb(dxf dxfVar, ewg ewgVar, ihk ihkVar, ele eleVar, Executor executor, Executor executor2) {
        this.g = dxfVar;
        this.b = ewgVar;
        this.h = ihkVar;
        this.j = eleVar;
        this.c = executor;
        this.d = executor2;
        ewgVar.g(new ela(this, 7));
    }

    public final jiy a() {
        jiy i;
        synchronized (this.e) {
            if (!this.k) {
                c();
            }
            i = jiy.i(this.f);
        }
        return i;
    }

    public final void b(ewk ewkVar) {
        synchronized (this.e) {
            if (!this.k) {
                c();
            }
            this.i.h(ewkVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c() {
        synchronized (this.e) {
            this.k = true;
            jyz jyzVar = this.l;
            if (jyzVar != null) {
                jyzVar.cancel(false);
            }
            this.f.clear();
            byte[] bArr = null;
            this.l = null;
            jis c = this.b.c();
            if (c == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            jmx it = c.iterator();
            while (it.hasNext()) {
                lqc lqcVar = (lqc) it.next();
                lqd lqdVar = lqcVar.d;
                if (lqdVar == null) {
                    lqdVar = lqd.d;
                }
                lqf b = lqf.b(lqdVar.c);
                if (b == null) {
                    b = lqf.UNRECOGNIZED;
                }
                if (b == lqf.SPOT_DEVICE && eyf.t(lqcVar)) {
                    lqd lqdVar2 = lqcVar.d;
                    if (lqdVar2 == null) {
                        lqdVar2 = lqd.d;
                    }
                    this.g.c(lnb.SHARING_PENDING_CALCULATING_VALIDATION_CODE_STARTED, jdl.a, lqdVar2);
                    this.f.put(lqdVar2, etd.c());
                    lpz a2 = this.j.a(lqcVar);
                    ihk ihkVar = this.h;
                    kyf kyfVar = a2.b;
                    if (kyfVar == null) {
                        kyfVar = kyf.r;
                    }
                    jbx e = jbx.d(jbx.d(ihkVar.g.u()).f(new gfl(ihkVar, a2.c, kyfVar, 10, (char[]) null), ihkVar.d)).e(new emc(this, lqdVar2, 10, bArr), this.c);
                    int i = 11;
                    arrayList.add(e.b(iha.class, new ejc(this, lqdVar2, i), this.c).a(Throwable.class, new emc(this, lqdVar2, i, bArr), this.c));
                }
            }
            if (!arrayList.isEmpty()) {
                jyz g = iuu.D(arrayList).g(new idh(1), this.c);
                this.l = g;
                g.c(new cui(this, g, 19, (byte[]) null), this.c);
            }
            this.i.i();
        }
    }

    public final void d(ewk ewkVar) {
        synchronized (this.e) {
            this.i.j(ewkVar);
        }
    }
}
