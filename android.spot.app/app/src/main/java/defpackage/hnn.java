package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import com.google.android.gms.common.Feature;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class hnn implements jfe {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ hnn(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v31, types: [mko, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v33, types: [mko, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v82, types: [jfe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [lqz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8, types: [jfe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [jfe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5, types: [jfe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [jfe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [jfe, java.lang.Object] */
    @Override // defpackage.jfe
    public final Object a() {
        switch (this.b) {
            case 0:
                return ((hnk) this.a).a();
            case 1:
                return ((Context) this.a).getSharedPreferences("primes", 0);
            case 2:
                return jis.u(new bfr(14), (Iterable) this.a.a());
            case 3:
                return Long.valueOf(((ksr) ((hph) this.a).f).f().getTotalSpace() / 1024);
            case 4:
                return ((hpo) this.a).a();
            case 5:
                Object obj = this.a;
                long j = hqt.a;
                if (j == 0) {
                    synchronized (hqt.class) {
                        j = hqt.a;
                        if (j == 0) {
                            float f = 60.0f;
                            float floatValue = ((Float) hqt.a((Context) obj).e(Float.valueOf(60.0f))).floatValue();
                            if (floatValue >= 1.0f) {
                                f = floatValue;
                            }
                            long ceil = (long) Math.ceil(1.0E9d / f);
                            hqt.a = ceil;
                            j = ceil;
                        }
                    }
                }
                return Long.valueOf(j);
            case 6:
                return this.a.a();
            case 7:
                int intValue = ((Long) this.a.a()).intValue();
                for (hss hssVar : hss.values()) {
                    if (intValue == hssVar.f) {
                        return hssVar;
                    }
                }
                return hss.DELAY_UNSPECIFIED;
            case 8:
                return (SharedPreferences) ((jer) this.a).c();
            case 9:
                return Boolean.valueOf(lxl.a.a().b((Context) this.a));
            case 10:
                return new hot((Context) ((hot) this.a).a);
            case 11:
                kdo kdoVar = new kdo((char[]) null);
                kdoVar.c = this.a;
                Object obj2 = kdoVar.c;
                obj2.getClass();
                if (kdoVar.a == null) {
                    kdoVar.a = hvq.b;
                }
                if (kdoVar.d == null) {
                    kdoVar.d = hwx.H(new hnn(obj2, 12));
                }
                if (kdoVar.b == null) {
                    kdoVar.b = jer.i(new hxh(kdoVar.a));
                }
                if (kdoVar.e == null) {
                    Object obj3 = kdoVar.c;
                    ArrayList arrayList = new ArrayList();
                    Collections.addAll(arrayList, new ijx(new ksr((Context) obj3)), new ika(new ikg()));
                    kdoVar.e = hwx.H(new hnn(arrayList, 13));
                }
                if (kdoVar.f == null) {
                    kdoVar.f = new hnn(kdoVar, 14);
                }
                return new hvq((Context) kdoVar.c, kdoVar.a, kdoVar.d, (jer) kdoVar.b, kdoVar.e, kdoVar.f);
            case 12:
                return new hot(new fwn((Context) this.a));
            case 13:
                return new kpb((List) this.a);
            case 14:
                Object obj4 = ((kdo) this.a).c;
                Context context = hvq.a;
                try {
                    return jer.i(((Context) obj4).getPackageManager().getApplicationInfo("com.google.android.gms", 0));
                } catch (PackageManager.NameNotFoundException unused) {
                    return jdl.a;
                }
            case 15:
                int i = hwa.c;
                return hvm.a((Context) this.a);
            case 16:
                hwx.a();
                fez fezVar = (fez) this.a;
                Set set = (Set) hxa.e.get(new jes(fezVar.j, fezVar.i));
                if (set != null) {
                    return set;
                }
                return jmo.a;
            case 17:
                hwx.a();
                Set set2 = (Set) hxa.f.get(((fez) this.a).j);
                if (set2 != null) {
                    return set2;
                }
                return jmo.a;
            case 18:
                return ((hxc) this.a).a();
            case 19:
                Object obj5 = this.a;
                hxy hxyVar = (hxy) obj5;
                jzd jzdVar = (jzd) hxyVar.e.a();
                jzdVar.getClass();
                hot hotVar = (hot) hxyVar.d.a();
                hotVar.getClass();
                fjy fjyVar = new fjy();
                fjyVar.a = new fun(6);
                fjyVar.b = new Feature[]{fwj.h};
                fjyVar.b();
                jyz g = jwu.g(jwb.g(jys.q(hot.d(((fhq) hotVar.a).f(fjyVar.a()))), hwf.class, new hkn(20), jzdVar), new huw(obj5, 7), jzdVar);
                g.c(new hsi(g, 15), jzdVar);
                return g;
            default:
                jzd jzdVar2 = (jzd) this.a.a();
                jzdVar2.getClass();
                return jzdVar2.schedule(new hxl(2), 10000L, TimeUnit.MILLISECONDS);
        }
    }
}
