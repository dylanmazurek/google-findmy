package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gor implements lsh {
    private final mko a;
    private final mko b;
    private final /* synthetic */ int c;

    public gor(mko mkoVar, mko mkoVar2, int i) {
        this.c = i;
        this.a = mkoVar;
        this.b = mkoVar2;
    }

    /* JADX WARN: Type inference failed for: r1v57, types: [fzi, java.lang.Object] */
    @Override // defpackage.mko, defpackage.mkn
    public final /* synthetic */ Object a() {
        jzd jzdVar = null;
        switch (this.c) {
            case 0:
                jzc jzcVar = (jzc) this.a.a();
                kpb kpbVar = (kpb) this.b.a();
                imi imiVar = imi.a;
                HashMap hashMap = new HashMap();
                hrb.k(iln.a, hashMap);
                return new ilv(jzcVar, kpbVar, imiVar, hashMap);
            case 1:
                return new gma(((lry) this.a).b(), (gnv) this.b.a());
            case 2:
                return new gps(((goq) this.a).b(), (grt) this.b.a());
            case 3:
                return new gpt(((gjh) this.a).a(), ((dvv) this.b).b());
            case 4:
                return new gpv(((gjh) this.a).a(), ((dvv) this.b).b());
            case 5:
                return new gqo(lsg.c(this.b), (jzc) this.a.a());
            case 6:
                return new gra(((lry) this.b).b(), (ddg) this.a.a(), new gwc());
            case 7:
                jer jerVar = (jer) ((lsi) this.b).b;
                jzd jzdVar2 = (jzd) this.a.a();
                joo jooVar = grd.a;
                jerVar.getClass();
                jzdVar2.getClass();
                mko mkoVar = (mko) jerVar.f();
                if (mkoVar != null) {
                    jzdVar = (jzd) mkoVar.a();
                }
                if (jzdVar == null) {
                    return jzdVar2;
                }
                return jzdVar;
            case 8:
                return new hri((grt) this.a.a(), ((gre) this.b).b());
            case 9:
                gsb gsbVar = (gsb) this.a.a();
                msw b = ((gre) this.b).b();
                gsbVar.getClass();
                return new hri((Object) gsbVar, b);
            case 10:
                return new hri(((gop) this.b).a(), ((dvu) this.a).b(), (byte[]) null);
            case 11:
                mko mkoVar2 = this.a;
                Context b2 = ((lry) this.b).b();
                jzd jzdVar3 = (jzd) mkoVar2.a();
                jzdVar3.getClass();
                return new gvg(jzdVar3, new kpb(b2, "STREAMZ_GNP_ANDROID"), (Application) b2);
            case 12:
                return new gvz(((lry) this.a).b(), (ktn) this.b.a());
            case 13:
                return new gyh(((goq) this.a).b(), (jer) ((lsi) this.b).b);
            case 14:
                return new hri(((gyn) this.b).a(), ((dvu) this.a).b(), (byte[]) null);
            case 15:
                hid hidVar = (hid) this.a.a();
                hjy hjyVar = (hjy) this.b.a();
                String str = hba.a;
                return new hba(hidVar.a, null, hjyVar);
            case 16:
                mko mkoVar3 = this.a;
                Context b3 = ((lry) this.b).b();
                jer b4 = ((dvv) mkoVar3).b();
                hjz hjzVar = new hjz();
                hjzVar.b(b3);
                hjzVar.b = (ExecutorService) b4.e(Executors.newCachedThreadPool(hog.Q()));
                return hjzVar.a();
            case 17:
                SharedPreferences sharedPreferences = (SharedPreferences) ((jfe) ((euo) this.b).b().e(new hnn(((lry) this.a).b(), 1))).a();
                sharedPreferences.getClass();
                return sharedPreferences;
            case 18:
                int i = hms.b;
                if (!ijs.g()) {
                    hpa hpaVar = (hpa) this.a.a();
                    if (!hpa.b()) {
                        ((jni) ((jni) hmz.a.g()).j("com/google/android/libraries/performance/primes/CrashOnBadPrimesConfiguration", "observedBackgroundInitialization", 29, "CrashOnBadPrimesConfiguration.java")).u("Primes init triggered from background in package: %s", hpaVar.a);
                        if (!hpaVar.a()) {
                            throw new IllegalStateException(String.format("Primes init triggered from background in package: %s", hpaVar.a));
                        }
                    }
                }
                return new hms(((hmv) this.b).a());
            case 19:
                hna hnaVar = (hna) this.b.a();
                int i2 = hnaVar.b;
                int i3 = hnaVar.a;
                bym a = ((fzh) this.a).a();
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(i2, new hmy(i3), new hmx());
                scheduledThreadPoolExecutor.setMaximumPoolSize(i2);
                jzd z = ivc.z(scheduledThreadPoolExecutor);
                ?? r1 = a.a;
                if (r1 != 0) {
                    z = r1.a();
                }
                z.getClass();
                return z;
            default:
                return new hnu(((lry) this.a).b(), (hot) this.b.a());
        }
    }

    public gor(mko mkoVar, mko mkoVar2, int i, float[] fArr) {
        this.c = i;
        this.b = mkoVar;
        this.a = mkoVar2;
    }
}
