package defpackage;

import android.content.Context;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hie implements lsh {
    private final mko a;
    private final mko b;
    private final mko c;
    private final mko d;

    public hie(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4) {
        this.a = mkoVar;
        this.b = mkoVar2;
        this.c = mkoVar3;
        this.d = mkoVar4;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.util.concurrent.ExecutorService] */
    @Override // defpackage.mko, defpackage.mkn
    public final /* synthetic */ Object a() {
        jer i;
        hbc hbcVar;
        ExecutorService executorService;
        gzf gzfVar;
        hiw hiwVar;
        gee geeVar;
        hjp hjpVar;
        hhg hhgVar;
        Context b = ((lry) this.a).b();
        jer b2 = ((dvv) this.b).b();
        hjy hjyVar = (hjy) this.c.a();
        gee geeVar2 = (gee) this.d.a();
        ExecutorService executorService2 = (ExecutorService) b2.e(Executors.newCachedThreadPool(hog.Q()));
        hfr hfrVar = new hfr(b, hjyVar, false);
        frx frxVar = new frx();
        hhi hhiVar = new hhi(0);
        hwx.V(true, "Either setAvatarRetriever or setAvatarImageLoader have to be called.");
        hhg hhgVar2 = new hhg(frxVar, hfrVar, hhiVar);
        hic hicVar = new hic(null);
        hicVar.h = new hib(0);
        hicVar.a = b.getApplicationContext();
        hicVar.i = hhgVar2;
        hicVar.c(executorService2);
        if (geeVar2 != null) {
            hicVar.g = geeVar2;
            if (!hicVar.b().g()) {
                hicVar.c(Executors.newCachedThreadPool(hog.Q()));
            }
            ?? c = hicVar.b().c();
            hicVar.a();
            hbc hbcVar2 = new hbc();
            hicVar.c = hbcVar2;
            hicVar.a();
            hicVar.b = new hih(hbcVar2);
            hicVar.a();
            hicVar.a().a.getClass();
            hicVar.e = new gzm(hicVar.a, c, hicVar.a().c, hicVar.a().a);
            hiw hiwVar2 = hicVar.f;
            if (hiwVar2 == null) {
                i = jdl.a;
            } else {
                i = jer.i(hiwVar2);
            }
            if (!i.g()) {
                hicVar.a();
                hicVar.f = new hiv(hicVar.a);
            }
            gee geeVar3 = hicVar.g;
            if (geeVar3 != null) {
                if (!(geeVar3 instanceof ged)) {
                    hicVar.a();
                    hicVar.h = new hjr(hbcVar2, geeVar3);
                }
                hih hihVar = hicVar.b;
                if (hihVar != null && (hbcVar = hicVar.c) != null && (executorService = hicVar.d) != null && (gzfVar = hicVar.e) != null && (hiwVar = hicVar.f) != null && (geeVar = hicVar.g) != null && (hjpVar = hicVar.h) != null && (hhgVar = hicVar.i) != null) {
                    return new hid(hihVar, hbcVar, executorService, gzfVar, hiwVar, geeVar, hjpVar, hhgVar, hicVar.j);
                }
                StringBuilder sb = new StringBuilder();
                if (hicVar.b == null) {
                    sb.append(" limitedAvailableAccountsModel");
                }
                if (hicVar.c == null) {
                    sb.append(" internalAccountsModel");
                }
                if (hicVar.d == null) {
                    sb.append(" backgroundExecutor");
                }
                if (hicVar.e == null) {
                    sb.append(" avatarImageLoader");
                }
                if (hicVar.f == null) {
                    sb.append(" oneGoogleEventLogger");
                }
                if (hicVar.g == null) {
                    sb.append(" vePrimitives");
                }
                if (hicVar.h == null) {
                    sb.append(" visualElements");
                }
                if (hicVar.i == null) {
                    sb.append(" accountLayer");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
            }
            throw new IllegalStateException("Property \"vePrimitives\" has not been set");
        }
        throw new NullPointerException("Null vePrimitives");
    }
}
