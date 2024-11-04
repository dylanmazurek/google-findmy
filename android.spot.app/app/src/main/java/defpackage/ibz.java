package defpackage;

import android.net.Uri;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ibz implements jxd {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ ibz(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v52, types: [java.lang.Object, jyz] */
    /* JADX WARN: Type inference failed for: r12v14, types: [java.lang.Object, jyz] */
    /* JADX WARN: Type inference failed for: r12v20, types: [ifr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v24, types: [ifr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v28, types: [ifr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v30, types: [java.lang.Object, jyz] */
    /* JADX WARN: Type inference failed for: r2v29, types: [java.lang.Object, jyz] */
    /* JADX WARN: Type inference failed for: r2v3, types: [icq, java.lang.Object] */
    @Override // defpackage.jxd
    public final jyz a(Object obj) {
        boolean z;
        long min;
        int i = 12;
        switch (this.c) {
            case 0:
                Throwable th = (Throwable) obj;
                Object obj2 = this.b;
                Object obj3 = this.a;
                synchronized (((ici) obj3).d) {
                    ((ici) obj3).f.remove(obj2);
                }
                return ivc.D(th);
            case 1:
                return iap.a((lim) this.a, (lim) this.b, (lim) obj);
            case 2:
                idb idbVar = (idb) this.b;
                return idbVar.d.b(ico.RING, idbVar.c, this.a);
            case 3:
                hwx.U(((ics) obj).a.z());
                ?? r12 = this.b;
                Object obj4 = this.a;
                idb idbVar2 = (idb) obj4;
                return jbx.d(ivc.L(r12, 30L, TimeUnit.SECONDS, idbVar2.b)).e(new huw(obj4, i), idbVar2.b).b(TimeoutException.class, new hxj(obj4, i), idbVar2.b);
            case 4:
                return ((ifo) this.a).b(this.b);
            case 5:
                if (((Boolean) obj).booleanValue()) {
                    return jyv.a;
                }
                return ((ifo) this.a).b(this.b);
            case 6:
                return ((ifo) this.a).b(this.b);
            case 7:
                jer jerVar = (jer) obj;
                hwx.V(jerVar.g(), "Cannot apply to share a device without an owner key");
                Object obj5 = this.a;
                ijk k = ijm.k();
                lim limVar = ((ihd) obj5).a;
                ihk ihkVar = (ihk) this.b;
                ije a = ihkVar.a(limVar);
                ljh k2 = kzr.c.k();
                lim f = ijm.f(((ijf) jerVar.c()).b, a.d);
                if (!k2.b.y()) {
                    k2.t();
                }
                ljn ljnVar = k2.b;
                f.getClass();
                ((kzr) ljnVar).a = f;
                lim limVar2 = k.b;
                if (!ljnVar.y()) {
                    k2.t();
                }
                kzr kzrVar = (kzr) k2.b;
                limVar2.getClass();
                kzrVar.b = limVar2;
                kzr kzrVar2 = (kzr) k2.q();
                hnu hnuVar = ihkVar.f;
                kxv b = iji.b(a.b);
                long j = a.c;
                lim f2 = ijm.f(((ijf) jerVar.c()).b, k.a().e());
                jdl jdlVar = jdl.a;
                ljh k3 = kyq.g.k();
                if (!k3.b.y()) {
                    k3.t();
                }
                kyq kyqVar = (kyq) k3.b;
                kzrVar2.getClass();
                kyqVar.c = kzrVar2;
                kyqVar.b = 6;
                return hnuVar.k(11, b, jdlVar, jer.i((kyq) k3.q()), jer.i(Long.valueOf(j)), jer.i(f2));
            case 8:
                lim limVar3 = ((ihd) this.a).a;
                ihk ihkVar2 = (ihk) this.b;
                ije a2 = ihkVar2.a(limVar3);
                return ihkVar2.f.i(2, iji.b(a2.b), a2.c, jdl.a);
            case 9:
                ljh k4 = laf.c.k();
                ljn ljnVar2 = (ljn) this.b;
                ljh ljhVar = (ljh) ljnVar2.z(5);
                ljhVar.w(ljnVar2);
                if (!ljhVar.b.y()) {
                    ljhVar.t();
                }
                iho ihoVar = (iho) this.a;
                ((kxy) ljhVar.b).d = ihoVar.b;
                if (ihoVar.d.getAndIncrement() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!ljhVar.b.y()) {
                    ljhVar.t();
                }
                ((kxy) ljhVar.b).e = z;
                kxy kxyVar = (kxy) ljhVar.q();
                if (!k4.b.y()) {
                    k4.t();
                }
                ddg ddgVar = ihoVar.e;
                laf lafVar = (laf) k4.b;
                kxyVar.getClass();
                lafVar.b = kxyVar;
                lafVar.a |= 1;
                laf lafVar2 = (laf) k4.q();
                hwx.K(!ihoVar.c.g(), "Routing information is not supported");
                mbg mbgVar = kzy.g;
                if (mbgVar == null) {
                    synchronized (kzy.class) {
                        mbgVar = kzy.g;
                        if (mbgVar == null) {
                            mbd a3 = mbg.a();
                            a3.d = mbf.UNARY;
                            a3.e = mbg.c("google.internal.spot.v1.SpotService", "UploadClientActionResult");
                            a3.b();
                            laf lafVar3 = laf.c;
                            lja ljaVar = mkc.a;
                            a3.b = new mkb(lafVar3);
                            a3.c = new mkb(lag.a);
                            mbgVar = a3.a();
                            kzy.g = mbgVar;
                        }
                    }
                }
                mkf mkfVar = (mkf) ddgVar.a;
                jyz a4 = mkj.a(mkfVar.a.a(mbgVar, mkfVar.b), lafVar2);
                ijp.b(a4, "UploadClientActionResult");
                return iuu.o(a4, new ene(3), jxv.a);
            case 10:
                return ivc.E(((ilp) this.b).e((Uri) this.a));
            case 11:
                Object obj6 = this.a;
                return jwu.h(this.b, jbn.c(new ifl(obj6, i)), ((ilz) obj6).c);
            case 12:
                return ivc.E(((ilz) this.b).g((Uri) this.a));
            case 13:
                return ivc.E(((ilz) this.b).c((Uri) this.a));
            case 14:
                Object obj7 = this.a;
                imc imcVar = (imc) obj7;
                imcVar.c((Uri) ivc.M(imcVar.a), obj);
                Object obj8 = imcVar.d;
                ?? r2 = this.b;
                synchronized (obj8) {
                    ((imc) obj7).e = r2;
                }
                return ivc.E(obj);
            default:
                Exception exc = (Exception) obj;
                ?? r0 = this.b;
                if (!r0.isCancelled()) {
                    jub jubVar = (jub) this.a;
                    int i2 = jubVar.h;
                    long a5 = jubVar.e.a(TimeUnit.MILLISECONDS);
                    jtw.c(i2);
                    jtw.d(a5, "elapsedMillis");
                    if (i2 == 0) {
                        min = 0;
                    } else {
                        long j2 = ((jtv) jubVar.c).a - a5;
                        if (j2 <= 0) {
                            min = -1;
                        } else {
                            min = Math.min(j2, 500L);
                        }
                    }
                    if (min < 0 || !jubVar.d.a(exc)) {
                        ((jni) ((jni) ((jni) idt.a.f().h(flv.a, 284)).i(exc)).j("com/google/android/libraries/spot/ble/GattClientImpl$2", "terminalExceptionCaught", (char) 433, "GattClientImpl.java")).r("Connection RetryingFuture caught fatal exception.");
                        int i3 = jubVar.h;
                        throw new jtq(exc);
                    }
                    jua juaVar = jubVar.g;
                    ((jni) ((jni) ((jni) idt.a.g().h(flv.a, 284)).i(exc)).j("com/google/android/libraries/spot/ble/GattClientImpl$2", "retryableExceptionCaught", (char) 419, "GattClientImpl.java")).r("Connection RetryingFuture caught exception; retrying.");
                    synchronized (((idk) juaVar).a.j) {
                        fyz fyzVar = ((idk) juaVar).a.n;
                        if (fyzVar != null) {
                            fyzVar.b();
                            ((idk) juaVar).a.n.a();
                            ((idk) juaVar).a.n = null;
                        }
                    }
                    jubVar.e(min, TimeUnit.MILLISECONDS);
                    return ivc.E(jub.a);
                }
                return r0;
        }
    }

    public /* synthetic */ ibz(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
