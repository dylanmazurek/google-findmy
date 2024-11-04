package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dxf {
    public static final jnk a = jnk.l("com/google/android/apps/adm/clearcut/FmdClearcutLoggerImpl");
    public final ffc b;
    public final ffc c;
    public final ffl d;
    public final jzd e;
    public final Object f = new Object();
    public Account g;
    public jer h;
    private final elz i;
    private final lna j;
    private final eld k;
    private final gok l;
    private final ktn m;

    public dxf(Context context, ffc ffcVar, ffc ffcVar2, elz elzVar, eld eldVar, ktn ktnVar, gok gokVar, jzd jzdVar) {
        String str;
        this.i = elzVar;
        this.b = ffcVar;
        this.c = ffcVar2;
        this.e = jzdVar;
        this.k = eldVar;
        this.l = gokVar;
        this.m = ktnVar;
        String str2 = null;
        elzVar.a(new dym(this, 1, 0 == true ? 1 : 0));
        e();
        ljh k = lna.d.k();
        if (!k.b.y()) {
            k.t();
        }
        lna lnaVar = (lna) k.b;
        lnaVar.b = 2;
        lnaVar.a = 1 | lnaVar.a;
        try {
            str2 = context.getPackageManager().getPackageInfo("com.google.android.apps.adm", 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            ((jni) ((jni) ((jni) a.g().h(jop.a, "FmdClearcutLogger")).i(e)).j("com/google/android/apps/adm/clearcut/FmdClearcutLoggerImpl", "<init>", 'm', "FmdClearcutLoggerImpl.java")).r("Could not find package info for logging version name. ");
        }
        if (!TextUtils.isEmpty(str2)) {
            if (!k.b.y()) {
                k.t();
            }
            lna lnaVar2 = (lna) k.b;
            str2.getClass();
            lnaVar2.a |= 2;
            lnaVar2.c = str2;
        } else {
            jni jniVar = (jni) ((jni) a.g().h(jop.a, "FmdClearcutLogger")).j("com/google/android/apps/adm/clearcut/FmdClearcutLoggerImpl", "<init>", 114, "FmdClearcutLoggerImpl.java");
            if (str2 == null) {
                str = "null";
            } else {
                str = "empty";
            }
            jniVar.u("Invalid version name. Got %s", str);
        }
        this.j = (lna) k.q();
        this.d = fzz.b(context, new fsn());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Object, ele] */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.lang.Object, ele] */
    /* JADX WARN: Type inference failed for: r2v23, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v28, types: [java.lang.Object, ele] */
    /* JADX WARN: Type inference failed for: r7v35, types: [lqz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v71, types: [java.lang.Object, ele] */
    private final void f(int i, lnb lnbVar, jer jerVar, jer jerVar2, jer jerVar3) {
        String str;
        int i2;
        jer jerVar4;
        jer jerVar5;
        lpt lptVar;
        if (!ltx.a.a().a()) {
            ((jni) ((jni) a.d().h(jop.a, "FmdClearcutLogger")).j("com/google/android/apps/adm/clearcut/FmdClearcutLoggerImpl", "log", 199, "FmdClearcutLoggerImpl.java")).r("Clearcut logging is disabled.");
            return;
        }
        final ljh k = lnc.i.k();
        if (!k.b.y()) {
            k.t();
        }
        ljn ljnVar = k.b;
        lnc lncVar = (lnc) ljnVar;
        lncVar.c = lnbVar.eh;
        lncVar.a |= 2;
        if (!ljnVar.y()) {
            k.t();
        }
        ljn ljnVar2 = k.b;
        lnc lncVar2 = (lnc) ljnVar2;
        lncVar2.e = i - 1;
        lncVar2.a |= 8;
        lna lnaVar = this.j;
        if (!ljnVar2.y()) {
            k.t();
        }
        lnc lncVar3 = (lnc) k.b;
        lnaVar.getClass();
        lncVar3.f = lnaVar;
        lncVar3.a |= 16;
        if (jerVar.g()) {
            lmu lmuVar = (lmu) jerVar.c();
            if (!k.b.y()) {
                k.t();
            }
            lnc lncVar4 = (lnc) k.b;
            lncVar4.d = lmuVar;
            lncVar4.a |= 4;
        }
        int i3 = 1;
        if (!jerVar2.g()) {
            str = "log";
        } else {
            eld eldVar = this.k;
            Object c = jerVar2.c();
            ljh k2 = lng.g.k();
            lmp lmpVar = (lmp) dxk.a.e(c);
            if (!k2.b.y()) {
                k2.t();
            }
            lng lngVar = (lng) k2.b;
            lmpVar.getClass();
            lngVar.b = lmpVar;
            lngVar.a |= 1;
            if (!((jer) eldVar.b).g()) {
                jerVar4 = jdl.a;
                str = "log";
            } else {
                jer b = eyf.b(((ewg) ((jer) eldVar.b).c()).c(), (lqd) c);
                if (!b.g() || !eldVar.d.b((lqc) b.c())) {
                    str = "log";
                    jerVar4 = jdl.a;
                } else {
                    lpz a2 = eldVar.d.a((lqc) b.c());
                    ljh k3 = lnf.g.k();
                    if (!k3.b.y()) {
                        k3.t();
                    }
                    lnf lnfVar = (lnf) k3.b;
                    lnfVar.a |= 1;
                    lnfVar.b = true;
                    kyf kyfVar = a2.b;
                    if (kyfVar == null) {
                        kyfVar = kyf.r;
                    }
                    kyl kylVar = kyfVar.c;
                    if (kylVar == null) {
                        kylVar = kyl.j;
                    }
                    int ab = hwx.ab(kylVar.g);
                    if (ab == 0) {
                        ab = 1;
                    }
                    if (!k3.b.y()) {
                        k3.t();
                    }
                    ljn ljnVar3 = k3.b;
                    str = "log";
                    lnf lnfVar2 = (lnf) ljnVar3;
                    if (ab != 1) {
                        lnfVar2.c = ab - 2;
                        lnfVar2.a |= 2;
                        kyf kyfVar2 = a2.b;
                        if (kyfVar2 == null) {
                            kyfVar2 = kyf.r;
                        }
                        kye b2 = kye.b(kyfVar2.k);
                        if (b2 == null) {
                            b2 = kye.UNRECOGNIZED;
                        }
                        if (!ljnVar3.y()) {
                            k3.t();
                        }
                        lnf lnfVar3 = (lnf) k3.b;
                        lnfVar3.e = b2.a();
                        lnfVar3.a |= 8;
                        kyf kyfVar3 = a2.b;
                        if (kyfVar3 == null) {
                            kyfVar3 = kyf.r;
                        }
                        if ((kyfVar3.a & 4) != 0) {
                            ljh k4 = lne.c.k();
                            kyf kyfVar4 = a2.b;
                            if (kyfVar4 == null) {
                                kyfVar4 = kyf.r;
                            }
                            kzc kzcVar = kyfVar4.d;
                            if (kzcVar == null) {
                                kzcVar = kzc.c;
                            }
                            int x = a.x(kzcVar.a);
                            if (x == 0) {
                                x = 1;
                            }
                            if (!k4.b.y()) {
                                k4.t();
                            }
                            lne lneVar = (lne) k4.b;
                            lneVar.b = a.B(x);
                            lneVar.a |= 1;
                            if (!k3.b.y()) {
                                k3.t();
                            }
                            lnf lnfVar4 = (lnf) k3.b;
                            lne lneVar2 = (lne) k4.q();
                            lneVar2.getClass();
                            lnfVar4.d = lneVar2;
                            lnfVar4.a |= 4;
                        }
                        jer b3 = ((jer) eldVar.c.a()).b(new dyv((lqc) b.c(), i3));
                        if (b3.g()) {
                            boolean booleanValue = ((Boolean) b3.c()).booleanValue();
                            if (!k3.b.y()) {
                                k3.t();
                            }
                            lnf lnfVar5 = (lnf) k3.b;
                            lnfVar5.a |= 16;
                            lnfVar5.f = booleanValue;
                        }
                        jerVar4 = jer.i((lnf) k3.q());
                    } else {
                        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
                    }
                }
            }
            if (jerVar4.g()) {
                Object c2 = jerVar4.c();
                if (!k2.b.y()) {
                    k2.t();
                }
                lng lngVar2 = (lng) k2.b;
                lngVar2.f = (lnf) c2;
                lngVar2.a |= 16;
            }
            if (((jer) eldVar.b).g()) {
                jerVar5 = eyf.b(((ewg) ((jer) eldVar.b).c()).c(), (lqd) c);
            } else {
                jerVar5 = jdl.a;
            }
            if (jerVar5.g()) {
                int an = hzc.an(((lqc) jerVar5.c()).f);
                if (an != 0 && an != 1) {
                    int an2 = hzc.an(((lqc) jerVar5.c()).f);
                    if (an2 == 0) {
                        an2 = 1;
                    }
                    if (!k2.b.y()) {
                        k2.t();
                    }
                    lng lngVar3 = (lng) k2.b;
                    if (an2 != 1) {
                        lngVar3.c = an2 - 2;
                        lngVar3.a |= 2;
                    } else {
                        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
                    }
                }
                if (eyf.q((lqc) jerVar5.c())) {
                    lqc lqcVar = (lqc) jerVar5.c();
                    if (lqcVar.b == 3) {
                        lptVar = (lpt) lqcVar.c;
                    } else {
                        lptVar = lpt.C;
                    }
                    String str2 = lptVar.e;
                    if (!k2.b.y()) {
                        k2.t();
                    }
                    ljn ljnVar4 = k2.b;
                    lng lngVar4 = (lng) ljnVar4;
                    str2.getClass();
                    lngVar4.a |= 4;
                    lngVar4.d = str2;
                    String str3 = lptVar.d;
                    if (!ljnVar4.y()) {
                        k2.t();
                    }
                    lng lngVar5 = (lng) k2.b;
                    str3.getClass();
                    lngVar5.a |= 8;
                    lngVar5.e = str3;
                } else if (eldVar.d.b((lqc) jerVar5.c())) {
                    lpz a3 = eldVar.d.a((lqc) jerVar5.c());
                    kyf kyfVar5 = a3.b;
                    if (kyfVar5 == null) {
                        kyfVar5 = kyf.r;
                    }
                    String str4 = kyfVar5.h;
                    if (!k2.b.y()) {
                        k2.t();
                    }
                    ljn ljnVar5 = k2.b;
                    lng lngVar6 = (lng) ljnVar5;
                    str4.getClass();
                    lngVar6.a |= 4;
                    lngVar6.d = str4;
                    kyf kyfVar6 = a3.b;
                    if (kyfVar6 == null) {
                        kyfVar6 = kyf.r;
                    }
                    String str5 = kyfVar6.j;
                    if (!ljnVar5.y()) {
                        k2.t();
                    }
                    lng lngVar7 = (lng) k2.b;
                    str5.getClass();
                    lngVar7.a |= 8;
                    lngVar7.e = str5;
                }
            }
            lng lngVar8 = (lng) k2.q();
            if (!k.b.y()) {
                k.t();
            }
            lnc lncVar5 = (lnc) k.b;
            lngVar8.getClass();
            lncVar5.g = lngVar8;
            lncVar5.a |= 64;
        }
        if (jerVar3.g()) {
            Object c3 = jerVar3.c();
            if (!k.b.y()) {
                k.t();
            }
            lnc lncVar6 = (lnc) k.b;
            lncVar6.a |= 1;
            lncVar6.b = (String) c3;
        }
        eld eldVar2 = this.k;
        ljh k5 = lnd.c.k();
        kyt kytVar = (kyt) ((eim) eldVar2.a).a().b(new dvh(4)).e(kyt.FMDN_DISABLED_DEFAULT);
        if (!k5.b.y()) {
            k5.t();
        }
        lnd lndVar = (lnd) k5.b;
        lndVar.b = kytVar.a();
        lndVar.a |= 1;
        lnd lndVar2 = (lnd) k5.q();
        if (!k.b.y()) {
            k.t();
        }
        lnc lncVar7 = (lnc) k.b;
        lndVar2.getClass();
        lncVar7.h = lndVar2;
        lncVar7.a |= 128;
        jni jniVar = (jni) ((jni) a.d().h(jop.a, "FmdClearcutLogger")).j("com/google/android/apps/adm/clearcut/FmdClearcutLoggerImpl", str, 223, "FmdClearcutLoggerImpl.java");
        lnb b4 = lnb.b(((lnc) k.b).c);
        if (b4 == null) {
            b4 = lnb.UNKNOWN_EVENT_TYPE;
        }
        jniVar.u("Clearcut log: %s", b4.name());
        gok gokVar = this.l;
        final Runnable runnable = new Runnable() { // from class: dxc
            /* JADX WARN: Code restructure failed: missing block: B:71:0x00f1, code lost:            if (r1 == false) goto L13;     */
            /* JADX WARN: Removed duplicated region for block: B:15:0x0167  */
            /* JADX WARN: Type inference failed for: r1v18, types: [jfe, java.lang.Object] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 711
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.dxc.run():void");
            }
        };
        Object obj = gokVar.b;
        ksr ksrVar = (ksr) obj;
        if (!((fxs) ksrVar.c).i()) {
            i2 = 2;
            ((fxs) ksrVar.c).l(jxv.a, new fgb(obj, i2));
        } else {
            i2 = 2;
        }
        ((fxs) ksrVar.c).b(gokVar.a, new fqx(i2)).c(gokVar.a, new fxr() { // from class: fqy
            @Override // defpackage.fxr
            public final fxs a(Object obj2) {
                runnable.run();
                return fma.o(null);
            }
        }).p(new fxl() { // from class: dxd
            @Override // defpackage.fxl
            public final void a() {
                ((jni) ((jni) dxf.a.d().h(jop.a, "FmdClearcutLogger")).j("com/google/android/apps/adm/clearcut/FmdClearcutLoggerImpl", "lambda$log$1", 230, "FmdClearcutLoggerImpl.java")).r("Checkbox not consented or not available, not logging.");
            }
        });
    }

    public final void a(lnb lnbVar, lqd lqdVar, String str) {
        f(1, lnbVar, jdl.a, jer.i(lqdVar), jer.i(str));
    }

    public final void b(lnb lnbVar, jer jerVar) {
        jdl jdlVar = jdl.a;
        f(2, lnbVar, jerVar, jdlVar, jdlVar);
    }

    public final void c(lnb lnbVar, jer jerVar, lqd lqdVar) {
        f(2, lnbVar, jerVar, jer.i(lqdVar), jdl.a);
    }

    public final void d(lnb lnbVar, jer jerVar, lqd lqdVar, String str) {
        f(2, lnbVar, jerVar, jer.i(lqdVar), jer.i(str));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:23:0x0127
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.Map, java.lang.Object] */
    public final void e() {
        /*
            Method dump skipped, instructions count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxf.e():void");
    }
}
