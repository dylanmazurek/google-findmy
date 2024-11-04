package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.libraries.notifications.platform.data.impl.GnpRoomDatabase;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gnj implements lsh {
    private final mko a;
    private final /* synthetic */ int b;

    public gnj(mko mkoVar, int i) {
        this.b = i;
        this.a = mkoVar;
    }

    @Override // defpackage.mko, defpackage.mkn
    public final /* synthetic */ Object a() {
        Context context;
        jzd jzdVar;
        jzd jzdVar2;
        switch (this.b) {
            case 0:
                return new ddg(((lry) this.a).b(), (byte[]) null);
            case 1:
                return new ddg((glz) this.a.a());
            case 2:
                ((fma) this.a.a()).getClass();
                return new Random(fma.i().toEpochMilli());
            case 3:
                cig g = bwd.g(((lry) this.a).b(), GnpRoomDatabase.class, "gnp_fcm_database");
                g.c();
                GnpRoomDatabase gnpRoomDatabase = (GnpRoomDatabase) g.a();
                gnpRoomDatabase.getClass();
                return gnpRoomDatabase;
            case 4:
                cig g2 = bwd.g(((lry) this.a).b(), GnpRoomDatabase.class, "gnp_database");
                g2.c();
                GnpRoomDatabase gnpRoomDatabase2 = (GnpRoomDatabase) g2.a();
                gnpRoomDatabase2.getClass();
                return gnpRoomDatabase2;
            case 5:
                return new kpb(Collections.singletonList(new ijx(new ksr(((lry) this.a).b()))));
            case 6:
                return new bym(((dvx) this.a).a().a);
            case 7:
                return new gpc(((gjh) this.a).a());
            case 8:
                return new gpu(((gjh) this.a).a());
            case 9:
                Context b = ((lry) this.a).b();
                nfp nfpVar = new nfp(nfq.a);
                nfpVar.e(nfo.o, nfo.n, nfo.q, nfo.p, nfo.h, nfo.j, nfo.i, nfo.k);
                nfpVar.f(ngr.b);
                nfpVar.c();
                nfq a = nfpVar.a();
                try {
                    Object obj = fwy.a;
                    fhd.d(b, 11925000);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    synchronized (fwy.a) {
                        if (!fwy.b) {
                            try {
                                context = fmz.b(b, fmz.b, "com.google.android.gms.providerinstaller.dynamite").c;
                            } catch (fmv e) {
                                Log.w("ProviderInstaller", "Failed to load providerinstaller module: ".concat(String.valueOf(e.getMessage())));
                                context = null;
                            }
                            if (context != null) {
                                fwy.a(context, "com.google.android.gms.providerinstaller.ProviderInstallerImpl");
                            }
                        }
                        boolean z = fwy.b;
                        Context c = fhd.c(b);
                        if (c == null) {
                            c = null;
                        } else {
                            fwy.b = true;
                            if (!z) {
                                try {
                                    long uptimeMillis2 = SystemClock.uptimeMillis();
                                    ClassLoader classLoader = c.getClassLoader();
                                    gok[] gokVarArr = {new gok(Context.class, b), gok.C(uptimeMillis), gok.C(uptimeMillis2)};
                                    Class<?> loadClass = classLoader.loadClass("com.google.android.gms.common.security.ProviderInstallerImpl");
                                    Class<?>[] clsArr = new Class[3];
                                    Object[] objArr = new Object[3];
                                    for (int i = 0; i < 3; i++) {
                                        gok gokVar = gokVarArr[i];
                                        gokVar.getClass();
                                        clsArr[i] = (Class) gokVar.a;
                                        objArr[i] = gokVar.b;
                                    }
                                    loadClass.getDeclaredMethod("reportRequestStats2", clsArr).invoke(null, objArr);
                                } catch (Exception e2) {
                                    Log.w("ProviderInstaller", "Failed to report request stats: ".concat(e2.toString()));
                                }
                            }
                        }
                        if (c != null) {
                            fwy.a(c, "com.google.android.gms.common.security.ProviderInstallerImpl");
                        } else {
                            Log.e("ProviderInstaller", "Failed to get remote context");
                            throw new fhb();
                        }
                    }
                } catch (fhb | fhc unused) {
                }
                ngg nggVar = new ngg(new ngh(new ngg()));
                List asList = Arrays.asList(a);
                asList.getClass();
                if (!amr.i(asList, nggVar.l)) {
                    nggVar.r = null;
                }
                nggVar.l = ngt.n(asList);
                return new ngh(nggVar);
            case 10:
                jer jerVar = (jer) ((lsi) this.a).b;
                joo jooVar = grd.a;
                jerVar.getClass();
                mko mkoVar = (mko) jerVar.f();
                if (mkoVar != null) {
                    jzdVar = (jzd) mkoVar.a();
                } else {
                    jzdVar = null;
                }
                if (jzdVar == null) {
                    lzt lztVar = new lzt(null, null, null);
                    lztVar.s("gnp-background-thread-%d");
                    gnt gntVar = new gnt(ivc.y(Executors.newFixedThreadPool(4, lzt.z(lztVar))), ivc.z(Executors.newSingleThreadScheduledExecutor()));
                    grd.a.k().r("`@GnpBackgroundExecutor ListeningScheduledExecutorService` was not provided, creating an internal executor");
                    return gntVar;
                }
                return jzdVar;
            case 11:
                jer jerVar2 = (jer) ((lsi) this.a).b;
                joo jooVar2 = grd.a;
                jerVar2.getClass();
                mko mkoVar2 = (mko) jerVar2.f();
                if (mkoVar2 != null) {
                    jzdVar2 = (jzd) mkoVar2.a();
                } else {
                    jzdVar2 = null;
                }
                if (jzdVar2 == null) {
                    lzt lztVar2 = new lzt(null, null, null);
                    lztVar2.s("gnp-blocking-thread-%d");
                    gnt gntVar2 = new gnt(ivc.y(Executors.newFixedThreadPool(8, lzt.z(lztVar2))), ivc.z(Executors.newSingleThreadScheduledExecutor()));
                    grd.a.k().r("`@GnpBlockingExecutor ListeningScheduledExecutorService` was not provided, creating an internal executor");
                    return gntVar2;
                }
                return jzdVar2;
            case 12:
                return new ddg((jer) ((lsi) this.a).b);
            case 13:
                SharedPreferences sharedPreferences = ((lry) this.a).b().getSharedPreferences("fcm_registration_data", 0);
                sharedPreferences.getClass();
                return sharedPreferences;
            case 14:
                SharedPreferences sharedPreferences2 = ((lry) this.a).b().getSharedPreferences("registration_data", 0);
                sharedPreferences2.getClass();
                return sharedPreferences2;
            case 15:
                return new gvj(((lry) this.a).b());
            case 16:
                return new ddg(((gop) this.a).a());
            case 17:
                lrs lrsVar = new lrs();
                lrsVar.a = (gyg) this.a.a();
                return lrsVar;
            case 18:
                return new hnu((gll) this.a.a());
            case 19:
                return new hcd((frx) this.a.a());
            default:
                return new hjj(((lry) this.a).b());
        }
    }
}
