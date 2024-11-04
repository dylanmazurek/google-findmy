package defpackage;

import android.app.Application;
import android.content.Context;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hnu {
    public final Object a;

    public hnu(Object obj) {
        this.a = obj;
    }

    public static boolean c(hit hitVar) {
        if (hitVar.c) {
            return true;
        }
        return false;
    }

    private final jyz n(int i, kxv kxvVar) {
        jdl jdlVar = jdl.a;
        return j(i, kxvVar, jdlVar, jdlVar);
    }

    public final void a(hnt hntVar) {
        hntVar.getClass();
        Object obj = ((hot) this.a).a;
        int i = hnv.c;
        ((hnv) obj).a.add(hntVar);
    }

    public final void b(hnt hntVar) {
        Object obj = ((hot) this.a).a;
        int i = hnv.c;
        ((hnv) obj).a.remove(hntVar);
    }

    public final int d(Long l, int i) {
        long j;
        boolean z;
        if (l != null) {
            j = l.longValue();
            boolean z2 = false;
            if (j >= 0) {
                z = true;
            } else {
                z = false;
            }
            hwx.N(z, "accountId must be >= 0, got: %s.", j);
            if (j <= 998) {
                z2 = true;
            }
            hwx.N(z2, "accountId must be <= 998, got: %s.", j);
        } else {
            j = 999;
        }
        hwx.M(true, "jobType must be >= 0, got: %s.", i);
        hwx.M(true, "jobType must be <= 999, got: %s.", i);
        Integer num = ((gnv) this.a).g;
        num.getClass();
        num.intValue();
        return (i * 1000) + 111000000 + ((int) j);
    }

    public final jyz e(kxv kxvVar) {
        ljh k = kyc.c.k();
        if (!k.b.y()) {
            k.t();
        }
        Object obj = this.a;
        kyc kycVar = (kyc) k.b;
        kxvVar.getClass();
        kycVar.b = kxvVar;
        kycVar.a |= 1;
        kyc kycVar2 = (kyc) k.q();
        mbg mbgVar = kzy.e;
        if (mbgVar == null) {
            synchronized (kzy.class) {
                mbgVar = kzy.e;
                if (mbgVar == null) {
                    mbd a = mbg.a();
                    a.d = mbf.UNARY;
                    a.e = mbg.c("google.internal.spot.v1.SpotService", "DeleteBleDevice");
                    a.b();
                    kyc kycVar3 = kyc.c;
                    lja ljaVar = mkc.a;
                    a.b = new mkb(kycVar3);
                    a.c = new mkb(kyd.a);
                    mbgVar = a.a();
                    kzy.e = mbgVar;
                }
            }
        }
        mkf mkfVar = (mkf) obj;
        jyz a2 = mkj.a(mkfVar.a.a(mbgVar, mkfVar.b), kycVar2);
        ijp.b(a2, "DeleteBleDevice");
        return iuu.o(a2, new iaf(2), jxv.a);
    }

    public final jyz f(kxv kxvVar) {
        return n(2, kxvVar);
    }

    public final jyz g(kxv kxvVar) {
        return n(6, kxvVar);
    }

    public final jyz h(kxv kxvVar, String str) {
        return j(6, kxvVar, jer.i(str), jdl.a);
    }

    public final jyz i(int i, kxv kxvVar, long j, jer jerVar) {
        jdl jdlVar = jdl.a;
        return k(i, kxvVar, jdlVar, jdlVar, jer.i(Long.valueOf(j)), jerVar);
    }

    public final jyz j(int i, kxv kxvVar, jer jerVar, jer jerVar2) {
        jdl jdlVar = jdl.a;
        return k(i, kxvVar, jerVar, jerVar2, jdlVar, jdlVar);
    }

    public final jyz k(int i, kxv kxvVar, jer jerVar, jer jerVar2, jer jerVar3, jer jerVar4) {
        ljh k = lad.h.k();
        if (!k.b.y()) {
            k.t();
        }
        ljn ljnVar = k.b;
        lad ladVar = (lad) ljnVar;
        kxvVar.getClass();
        ladVar.b = kxvVar;
        ladVar.a |= 1;
        if (!ljnVar.y()) {
            k.t();
        }
        ((lad) k.b).c = i - 2;
        if (jerVar.g()) {
            Object c = jerVar.c();
            if (!k.b.y()) {
                k.t();
            }
            lad ladVar2 = (lad) k.b;
            ljv ljvVar = ladVar2.d;
            if (!ljvVar.c()) {
                ladVar2.d = ljn.p(ljvVar);
            }
            ladVar2.d.add(c);
        }
        if (jerVar2.g()) {
            Object c2 = jerVar2.c();
            if (!k.b.y()) {
                k.t();
            }
            lad ladVar3 = (lad) k.b;
            ladVar3.e = (kyq) c2;
            ladVar3.a |= 2;
        }
        if (jerVar3.g()) {
            long longValue = ((Long) jerVar3.c()).longValue();
            if (!k.b.y()) {
                k.t();
            }
            ((lad) k.b).f = longValue;
        }
        if (jerVar4.g()) {
            Object c3 = jerVar4.c();
            if (!k.b.y()) {
                k.t();
            }
            ((lad) k.b).g = (lim) c3;
        }
        Object obj = this.a;
        lad ladVar4 = (lad) k.q();
        mbg mbgVar = kzy.c;
        if (mbgVar == null) {
            synchronized (kzy.class) {
                mbgVar = kzy.c;
                if (mbgVar == null) {
                    mbd a = mbg.a();
                    a.d = mbf.UNARY;
                    a.e = mbg.c("google.internal.spot.v1.SpotService", "UpdateBleDeviceSharingSettings");
                    a.b();
                    lad ladVar5 = lad.h;
                    lja ljaVar = mkc.a;
                    a.b = new mkb(ladVar5);
                    a.c = new mkb(lae.c);
                    mbgVar = a.a();
                    kzy.c = mbgVar;
                }
            }
        }
        mkf mkfVar = (mkf) obj;
        jyz a2 = mkj.a(mkfVar.a.a(mbgVar, mkfVar.b), ladVar4);
        ijp.b(a2, "UpdateBleDeviceSharingSettings");
        return a2;
    }

    public final int l() {
        return ((AtomicInteger) this.a).get();
    }

    public final jyz m(kuv kuvVar) {
        if (((ljc) kuvVar.a).a.isEmpty()) {
            return ivc.E(jdl.a);
        }
        Object obj = this.a;
        ljh k = lab.d.k();
        Object obj2 = kuvVar.b;
        if (!k.b.y()) {
            k.t();
        }
        ljn ljnVar = k.b;
        lab labVar = (lab) ljnVar;
        obj2.getClass();
        labVar.b = (kyf) obj2;
        labVar.a |= 1;
        Object obj3 = kuvVar.a;
        if (!ljnVar.y()) {
            k.t();
        }
        lab labVar2 = (lab) k.b;
        obj3.getClass();
        labVar2.c = (ljc) obj3;
        labVar2.a |= 2;
        lab labVar3 = (lab) k.q();
        mkf mkfVar = (mkf) obj;
        lyt lytVar = mkfVar.a;
        mbg mbgVar = kzy.b;
        if (mbgVar == null) {
            synchronized (kzy.class) {
                mbgVar = kzy.b;
                if (mbgVar == null) {
                    mbd a = mbg.a();
                    a.d = mbf.UNARY;
                    a.e = mbg.c("google.internal.spot.v1.SpotService", "UpdateBleDevice");
                    a.b();
                    lab labVar4 = lab.d;
                    lja ljaVar = mkc.a;
                    a.b = new mkb(labVar4);
                    a.c = new mkb(lac.b);
                    mbgVar = a.a();
                    kzy.b = mbgVar;
                }
            }
        }
        jyz a2 = mkj.a(lytVar.a(mbgVar, mkfVar.b), labVar3);
        ijp.b(a2, "UpdateBleDevice");
        return iuu.o(a2, new iaf(0), jxv.a);
    }

    public hnu(Object obj, byte[] bArr) {
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.app.Application$ActivityLifecycleCallbacks, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.content.ComponentCallbacks, java.lang.Object] */
    public hnu(Context context, hot hotVar) {
        this.a = hotVar;
        Application application = (Application) context;
        application.registerActivityLifecycleCallbacks(hotVar.a);
        application.registerComponentCallbacks(hotVar.a);
    }

    public hnu(gll gllVar) {
        gllVar.getClass();
        this.a = gllVar;
    }

    public hnu(frx frxVar, jer jerVar) {
        frxVar.getClass();
        this.a = jerVar;
    }

    public hnu(byte[] bArr) {
        this.a = new ConcurrentHashMap();
    }

    public hnu() {
        this.a = new AtomicInteger();
    }
}
