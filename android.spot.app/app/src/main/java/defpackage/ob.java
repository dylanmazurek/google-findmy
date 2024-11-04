package defpackage;

import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ob extends mpe implements mnw {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ob(Object obj, int i) {
        super(0);
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v31, types: [zn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [cjz, java.lang.Object] */
    @Override // defpackage.mnw
    public final /* synthetic */ Object a() {
        Bundle bundle = null;
        int i = 0;
        switch (this.b) {
            case 0:
                return new drz(((oc) this.a).n);
            case 1:
                oc ocVar = (oc) this.a;
                Application application = ocVar.getApplication();
                if (ocVar.getIntent() != null) {
                    bundle = ((oc) this.a).getIntent().getExtras();
                }
                return new cgh(application, this.a, bundle);
            case 2:
                ox oxVar = new ox(new nl(this.a, 5));
                if (Build.VERSION.SDK_INT >= 33) {
                    Object obj = this.a;
                    if (!amr.i(Looper.myLooper(), Looper.getMainLooper())) {
                        new Handler(Looper.getMainLooper()).post(new bx(obj, oxVar, 8, (byte[]) null));
                    } else {
                        ((oc) obj).k(oxVar);
                    }
                }
                return oxVar;
            case 3:
                ((ox) this.a).d();
                return mlh.a;
            case 4:
                ((ox) this.a).c();
                return mlh.a;
            case 5:
                ((ox) this.a).d();
                return mlh.a;
            case 6:
                return Boolean.valueOf(nq.c((wi) this.a));
            case 7:
                ((uv) this.a).d = false;
                return mlh.a;
            case 8:
                ((uv) this.a).d = false;
                return mlh.a;
            case 9:
                return Long.valueOf(this.a.a());
            case 10:
                return ((yv) this.a).c.b;
            case 11:
                ((za) this.a).f();
                ((za) this.a).g();
                return true;
            case 12:
                ((zd) this.a).f();
                ((zd) this.a).g();
                return true;
            case 13:
                ((aqh) this.a).a();
                return mlh.a;
            case 14:
                awd a = ((axb) this.a).a();
                if (a.l != a.a.A().size()) {
                    Iterator it = a.e.entrySet().iterator();
                    while (it.hasNext()) {
                        ((avv) ((Map.Entry) it.next()).getValue()).d = true;
                    }
                    if (!a.a.ac()) {
                        ayr.aq(a.a, false, 7);
                    }
                }
                return mlh.a;
            case 15:
                axi axiVar = (axi) this.a;
                axiVar.e = false;
                HashSet hashSet = new HashSet();
                aiu aiuVar = axiVar.c;
                int i2 = aiuVar.b;
                if (i2 > 0) {
                    Object[] objArr = aiuVar.a;
                    int i3 = 0;
                    do {
                        ayr ayrVar = (ayr) objArr[i3];
                        qg qgVar = (qg) axiVar.d.a[i3];
                        aow aowVar = ayrVar.n.e;
                        if (aowVar.t) {
                            axi.b(aowVar, qgVar, hashSet);
                        }
                        i3++;
                    } while (i3 < i2);
                }
                axiVar.c.f();
                axiVar.d.f();
                aiu aiuVar2 = axiVar.a;
                int i4 = aiuVar2.b;
                if (i4 > 0) {
                    Object[] objArr2 = aiuVar2.a;
                    do {
                        axp axpVar = (axp) objArr2[i];
                        qg qgVar2 = (qg) axiVar.b.a[i];
                        if (axpVar.t) {
                            axi.b(axpVar, qgVar2, hashSet);
                        }
                        i++;
                    } while (i < i4);
                }
                axiVar.a.f();
                axiVar.b.f();
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((axp) it2.next()).x();
                }
                return mlh.a;
            case 16:
                ((axp) this.a).x();
                return mlh.a;
            case 17:
                ((apo) this.a).d();
                return mlh.a;
            case 18:
                aov aovVar = ((axp) this.a).a;
                aovVar.getClass();
                ((axh) aovVar).d();
                return mlh.a;
            case 19:
                ((ayr) this.a).o.c();
                return mlh.a;
            default:
                ayz ayzVar = ((ayx) this.a).z;
                ayzVar.j = 0;
                aiu n = ayzVar.a.n();
                int i5 = n.b;
                if (i5 > 0) {
                    Object[] objArr3 = n.a;
                    int i6 = 0;
                    do {
                        ayx r = ((ayr) objArr3[i6]).r();
                        r.g = r.h;
                        r.h = Integer.MAX_VALUE;
                        r.q = false;
                        if (r.A == 2) {
                            r.A = 3;
                        }
                        i6++;
                    } while (i6 < i5);
                }
                ((ayx) this.a).e(awu.h);
                ((ayx) this.a).d().G().d();
                ayr ayrVar2 = ((ayx) this.a).z.a;
                aiu n2 = ayrVar2.n();
                int i7 = n2.b;
                if (i7 > 0) {
                    Object[] objArr4 = n2.a;
                    do {
                        ayr ayrVar3 = (ayr) objArr4[i];
                        if (ayrVar3.r().g != ayrVar3.k()) {
                            ayrVar2.P();
                            ayrVar2.H();
                            if (ayrVar3.k() == Integer.MAX_VALUE) {
                                ayrVar3.r().k();
                            }
                        }
                        i++;
                    } while (i < i7);
                }
                ((ayx) this.a).e(awu.i);
                return mlh.a;
        }
    }
}
