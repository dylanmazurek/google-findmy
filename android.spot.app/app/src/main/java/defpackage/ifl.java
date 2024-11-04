package defpackage;

import android.net.Uri;
import com.google.android.gms.findmydevice.spot.GetKeychainLockScreenKnowledgeFactorSupportResponse;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ifl implements jxd {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ifl(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v104, types: [java.lang.Object, jyz] */
    /* JADX WARN: Type inference failed for: r0v62, types: [java.lang.Object, ihn] */
    /* JADX WARN: Type inference failed for: r0v88, types: [java.lang.Object, ilq] */
    /* JADX WARN: Type inference failed for: r2v48, types: [java.lang.Object, jei] */
    @Override // defpackage.jxd
    public final jyz a(Object obj) {
        jyz D;
        jyz e;
        jax i;
        OutputStream outputStream;
        jyz jyzVar;
        int i2 = 0;
        int i3 = 1;
        switch (this.b) {
            case 0:
                ieq ieqVar = (ieq) obj;
                Object obj2 = this.a;
                synchronized (((ifo) obj2).h) {
                    if (ifo.e.contains(ieqVar.getClass()) && ((ifo) obj2).j == ifj.RINGING) {
                        D = ((ifo) obj2).a();
                    } else {
                        D = ivc.D(ieqVar);
                    }
                }
                return D;
            case 1:
                return ((ifo) this.a).a();
            case 2:
                return ((ifo) this.a).b((ifr) obj);
            case 3:
                iiy iiyVar = (iiy) obj;
                Object c = iiyVar.b.c();
                lim limVar = iiyVar.a;
                Object obj3 = this.a;
                igx igxVar = (igx) obj3;
                igxVar.b(igq.SCANNING);
                kyg kygVar = igxVar.b.g;
                if (kygVar == null) {
                    kygVar = kyg.d;
                }
                int I = a.I(kygVar.c);
                if (I != 0 && I == 5) {
                    e = igxVar.f.w(igxVar.b, kyh.DEVICE_COMPONENT_CASE, new gfl(obj3, c, limVar, 9, (byte[]) null));
                } else {
                    kuv kuvVar = igxVar.f;
                    kyf kyfVar = igxVar.b;
                    gfl gflVar = new gfl(obj3, c, limVar, 8, (byte[]) null);
                    kyg kygVar2 = kyfVar.g;
                    if (kygVar2 == null) {
                        kygVar2 = kyg.d;
                    }
                    int I2 = a.I(kygVar2.c);
                    if (I2 != 0) {
                        i3 = I2;
                    }
                    Object obj4 = kuvVar.a;
                    jjr h = hqt.h(i3);
                    synchronized (((igh) obj4).c) {
                        kxv kxvVar = kyfVar.b;
                        if (kxvVar == null) {
                            kxvVar = kxv.b;
                        }
                        igd igdVar = (igd) ((igh) obj4).d.get(kxvVar.a);
                        Object obj5 = kuvVar.b;
                        if (igdVar != null && igdVar.g()) {
                            e = ((igh) obj4).e(kyfVar, h, gflVar, (igo) obj5, jer.i(c), false);
                        } else {
                            if (igdVar != null) {
                                igdVar.c();
                            }
                            e = ((igh) obj4).e(kyfVar, h, gflVar, (igo) obj5, jer.i(c), true);
                        }
                    }
                }
                return jbx.d(e).b(ieq.class, new etl(20), jxv.a);
            case 4:
                igx igxVar2 = (igx) this.a;
                igxVar2.b(igq.DELETING_FROM_SERVER);
                kxv kxvVar2 = igxVar2.b.b;
                if (kxvVar2 == null) {
                    kxvVar2 = kxv.b;
                }
                return jbx.d(igxVar2.d.e(kxvVar2)).b(Exception.class, new igw(i3), jxv.a);
            case 5:
                ((igx) this.a).b(igq.FAILED);
                return ivc.D((Throwable) obj);
            case 6:
                return ((ihk) this.a).g.u();
            case 7:
                if (((GetKeychainLockScreenKnowledgeFactorSupportResponse) obj).a) {
                    return ivc.D(new igz());
                }
                Object obj6 = this.a;
                kya kyaVar = kya.a;
                mbg mbgVar = kzy.a;
                if (mbgVar == null) {
                    synchronized (kzy.class) {
                        mbgVar = kzy.a;
                        if (mbgVar == null) {
                            mbd a = mbg.a();
                            a.d = mbf.UNARY;
                            a.e = mbg.c("google.internal.spot.v1.SpotService", "CreateUser");
                            a.b();
                            kya kyaVar2 = kya.a;
                            lja ljaVar = mkc.a;
                            a.b = new mkb(kyaVar2);
                            a.c = new mkb(kyb.a);
                            mbgVar = a.a();
                            kzy.a = mbgVar;
                        }
                    }
                }
                mkf mkfVar = (mkf) ((ihk) obj6).f.a;
                jyz a2 = mkj.a(mkfVar.a.a(mbgVar, mkfVar.b), kyaVar);
                ijp.b(a2, "CreateUser");
                return a2;
            case 8:
                ((jni) ((jni) ((jni) ihu.a.f().h(flv.a, 284)).i((Exception) obj)).j("com/google/android/libraries/spot/clientactions/SignedClientActionCommandHandlerImpl$ForAccountImpl", "lambda$handleCommand$2", 135, "SignedClientActionCommandHandlerImpl.java")).r("Command dispatched, but failed unexpectedly.");
                return this.a.a(ihp.b);
            case 9:
                jer jerVar = (jer) obj;
                boolean g = jerVar.g();
                Object obj7 = this.a;
                if (!g) {
                    kyq kyqVar = (kyq) obj7;
                    if (kyqVar.b == 3) {
                        i2 = ((Integer) kyqVar.c).intValue();
                    }
                    jer.i(Integer.valueOf(i2));
                    throw new iiv("No owner key is available locally.");
                }
                return ivc.E(kuv.t((kyq) obj7, (ijf) jerVar.c()));
            case 10:
                lkq lkqVar = (lkq) obj;
                Object obj8 = this.a;
                ilp ilpVar = (ilp) obj8;
                Uri uri = (Uri) ivc.M(ilpVar.b);
                Uri d = hrc.d(uri, ".tmp");
                try {
                    i = iqh.i("Write " + ((ilp) obj8).a);
                    try {
                        lyn lynVar = new lyn((byte[]) null);
                        try {
                            kpb kpbVar = ((ilp) obj8).g;
                            iky ikyVar = new iky();
                            ikyVar.a = new lyn[]{lynVar};
                            outputStream = (OutputStream) kpbVar.n(d, ikyVar);
                            try {
                                lkqVar.f(outputStream);
                                lynVar.n();
                                if (outputStream != null) {
                                    outputStream.close();
                                }
                                i.close();
                                ((ilp) obj8).g.p(d, uri);
                                return ivc.E(lkqVar);
                            } finally {
                            }
                        } catch (IOException e2) {
                            throw hrb.m(((ilp) obj8).g, uri, e2, ((ilp) obj8).a);
                        }
                    } finally {
                        try {
                            i.close();
                            throw th;
                        } catch (Throwable th) {
                            th.addSuppressed(th);
                        }
                    }
                } catch (IOException e3) {
                    if (ilpVar.g.q(d)) {
                        try {
                            ((ilp) obj8).g.o(d);
                            throw e3;
                        } catch (IOException e4) {
                            e3.addSuppressed(e4);
                            throw e3;
                        }
                    }
                    throw e3;
                }
            case 11:
                return this.a.c();
            case 12:
                Object obj9 = this.a;
                ilz ilzVar = (ilz) obj9;
                Uri uri2 = (Uri) ivc.M(ilzVar.b);
                Uri d2 = hrc.d(uri2, ".tmp");
                try {
                    i = iqh.i("Write " + ((ilz) obj9).a);
                    try {
                        lyn lynVar2 = new lyn((byte[]) null);
                        try {
                            kpb kpbVar2 = ((ilz) obj9).l;
                            iky ikyVar2 = new iky();
                            ikyVar2.a = new lyn[]{lynVar2};
                            outputStream = (OutputStream) kpbVar2.n(d2, ikyVar2);
                            try {
                                ((lkq) obj).f(outputStream);
                                lynVar2.n();
                                if (outputStream != null) {
                                    outputStream.close();
                                }
                                i.close();
                                ((ilz) obj9).l.p(d2, uri2);
                                synchronized (ilzVar.f) {
                                    ((ilz) obj9).g = obj;
                                }
                                return jyv.a;
                            } finally {
                            }
                        } catch (IOException e5) {
                            throw hrb.m(((ilz) obj9).l, uri2, e5, ((ilz) obj9).a);
                        }
                    } finally {
                    }
                } catch (IOException e6) {
                    if (ilzVar.l.q(d2)) {
                        try {
                            ((ilz) obj9).l.o(d2);
                            throw e6;
                        } catch (IOException e7) {
                            e6.addSuppressed(e7);
                            throw e6;
                        }
                    }
                    throw e6;
                }
            case 13:
                return this.a;
            case 14:
                imc imcVar = (imc) this.a;
                imcVar.c((Uri) ivc.M(imcVar.a), obj);
                return jyv.a;
            case 15:
                imc imcVar2 = (imc) this.a;
                return ivc.E(imcVar2.b((Uri) ivc.M(imcVar2.a)));
            case 16:
                Uri uri3 = (Uri) obj;
                Uri d3 = hrc.d(uri3, ".bak");
                Object obj10 = this.a;
                try {
                    if (((imc) obj10).f.q(d3)) {
                        ((imc) obj10).f.p(d3, uri3);
                    }
                    return jyv.a;
                } catch (IOException e8) {
                    return ivc.D(e8);
                }
            case 17:
                Object obj11 = this.a;
                synchronized (((imc) obj11).d) {
                    jyzVar = ((imc) obj11).e;
                }
                return jyzVar;
            case 18:
                return ivc.E(this.a.a(obj));
            case 19:
                return ((imf) this.a).c.c();
            default:
                return ((imf) this.a).b.i();
        }
    }
}
