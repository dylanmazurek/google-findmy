package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.work.impl.WorkDatabase;
import com.google.android.apps.adm.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ilv {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public ilv(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.c = layoutParams;
        this.e = new Rect();
        this.f = new int[2];
        this.a = new int[2];
        this.g = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.b = inflate;
        this.d = (TextView) inflate.findViewById(R.id.message);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    public static final void A(ilv ilvVar) {
        ((myu) ilvVar.b).e(ilvVar.C(((ewf) ilvVar.e).a()));
    }

    private final jer B(lqd lqdVar) {
        return eyf.b(((ewc) this.g).c, lqdVar).b(new dyv(this, 19));
    }

    private final edy C(lqc lqcVar) {
        lqc f;
        if (lqcVar != null && (f = bse.f(lqcVar)) != null) {
            lqd lqdVar = f.d;
            if (lqdVar == null) {
                lqdVar = lqd.d;
            }
            if (lqdVar != null) {
                return s(lqdVar);
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [jxd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v21, types: [java.util.Map, java.lang.Object] */
    public final synchronized imf a(ilu iluVar) {
        imf imfVar;
        boolean z;
        String substring;
        boolean z2;
        boolean z3;
        ?? r0 = this.a;
        Uri uri = iluVar.a;
        imfVar = (imf) r0.get(uri);
        boolean z4 = true;
        if (imfVar == null) {
            Uri uri2 = iluVar.a;
            hwx.O(uri2.isHierarchical(), "Uri must be hierarchical: %s", uri2);
            String n = ivc.n(uri2.getLastPathSegment());
            int lastIndexOf = n.lastIndexOf(46);
            if (lastIndexOf == -1) {
                substring = "";
            } else {
                substring = n.substring(lastIndexOf + 1);
            }
            hwx.O(substring.equals("pb"), "Uri extension must be .pb: %s", uri2);
            if (iluVar.b != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            hwx.K(z2, "Proto schema cannot be null");
            if (iluVar.c != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            hwx.K(z3, "Handler cannot be null");
            imd imdVar = iluVar.e;
            ?? r4 = this.f;
            String a = imdVar.a();
            imh imhVar = (imh) r4.get(a);
            if (imhVar == 0) {
                z4 = false;
            }
            hwx.O(z4, "No XDataStoreVariantFactory registered for ID %s", a);
            String n2 = ivc.n(iluVar.a.getLastPathSegment());
            int lastIndexOf2 = n2.lastIndexOf(46);
            if (lastIndexOf2 != -1) {
                n2 = n2.substring(0, lastIndexOf2);
            }
            jyz h = jwu.h(ivc.E(iluVar.a), this.e, jxv.a);
            img b = imhVar.b(iluVar, n2, this.c, (kpb) this.d);
            imhVar.a();
            imf imfVar2 = new imf(b, h);
            jis jisVar = iluVar.d;
            if (!jisVar.isEmpty()) {
                imfVar2.c(new ils(jisVar, this.c));
            }
            this.a.put(uri, imfVar2);
            this.b.put(uri, iluVar);
            imfVar = imfVar2;
        } else {
            ilu iluVar2 = (ilu) this.b.get(uri);
            if (!iluVar.equals(iluVar2)) {
                String I = hwx.I("ProtoDataStoreConfig<%s> doesn't match previous call [uri=%s] [%s]", iluVar.b.getClass().getSimpleName(), iluVar.a);
                hwx.O(iluVar.a.equals(iluVar2.a), I, "uri");
                hwx.O(iluVar.b.equals(iluVar2.b), I, "schema");
                hwx.O(iluVar.c.equals(iluVar2.c), I, "handler");
                hwx.O(hzc.L(iluVar.d, iluVar2.d), I, "migrations");
                hwx.O(iluVar.e.equals(iluVar2.e), I, "variantConfig");
                if (iluVar.f == iluVar2.f) {
                    z = true;
                } else {
                    z = false;
                }
                hwx.O(z, I, "useGeneratedExtensionRegistry");
                hwx.O(true, I, "enableTracing");
                throw new IllegalArgumentException(hwx.I(I, "unknown"));
            }
        }
        return imfVar;
    }

    public final eiv b(lqd lqdVar) {
        eix eixVar = (eix) ((ewc) this.g).a(lqdVar);
        eixVar.getClass();
        return eixVar.a();
    }

    public final eix c(lqc lqcVar) {
        lpz lpzVar;
        eiu c = eiv.c();
        if (lqcVar.b == 4) {
            lpzVar = (lpz) lqcVar.c;
        } else {
            lpzVar = lpz.e;
        }
        kyf kyfVar = lpzVar.b;
        if (kyfVar == null) {
            kyfVar = kyf.r;
        }
        kyg kygVar = kyfVar.g;
        if (kygVar == null) {
            kygVar = kyg.d;
        }
        int I = a.I(kygVar.c);
        if (I == 0) {
            I = 1;
        }
        jmw listIterator = hqt.k(I).listIterator();
        while (listIterator.hasNext()) {
            c.a.put((kyh) listIterator.next(), new eir(eit.c));
        }
        eid eidVar = new eid();
        eiv a = c.a();
        if (eidVar.a == null) {
            eidVar.b = a;
            elg c2 = eidVar.c();
            lqd lqdVar = lqcVar.d;
            if (lqdVar == null) {
                lqdVar = lqd.d;
            }
            r(lqdVar, c2, 1);
            return c2;
        }
        throw new IllegalStateException("Cannot set localDeviceSpotState after calling localDeviceSpotStateBuilder()");
    }

    public final ekl d(lqd lqdVar) {
        eix eixVar = (eix) ((ewc) this.g).a(lqdVar);
        eixVar.getClass();
        return eixVar.c();
    }

    public final jer e() {
        return jer.h(((ewf) this.e).a());
    }

    public final jer f() {
        jer b = e().b(new eil(14));
        if (b.g()) {
            jer h = jer.h(((ewc) this.g).a((lqd) b.c()));
            if (h.g() && (h.c() instanceof eix)) {
                return h.b(new eil(15));
            }
        }
        return jdl.a;
    }

    public final void g(ewk ewkVar) {
        ((dhx) this.a).h(ewkVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    public final void h(buc bucVar) {
        this.b.add(bucVar);
    }

    public final void i(ewk ewkVar) {
        ((dhx) this.f).h(ewkVar);
    }

    public final void j() {
        if (p()) {
            ((dhx) this.a).i();
        }
    }

    public final void k(lqd lqdVar, elr elrVar, boolean z) {
        amr.j();
        eix eixVar = (eix) ((ewc) this.g).a(lqdVar);
        if (eixVar != null || (eixVar = (eix) B(lqdVar).f()) != null) {
            eiw b = eixVar.b();
            elrVar.a(b.d());
            eix c = b.c();
            if (!eixVar.equals(c)) {
                int i = 1;
                if (true == z) {
                    i = 3;
                }
                r(lqdVar, c, i);
            }
        }
    }

    public final void l(ewk ewkVar) {
        ((dhx) this.a).j(ewkVar);
    }

    public final void m(ewk ewkVar) {
        ((dhx) this.f).j(ewkVar);
    }

    public final boolean n(lqd lqdVar) {
        return ((ewc) this.g).a(lqdVar) instanceof eix;
    }

    public final boolean o(lqd lqdVar) {
        lqc a = ((ewf) this.e).a();
        if (a == null) {
            return false;
        }
        lqd lqdVar2 = a.d;
        if (lqdVar2 == null) {
            lqdVar2 = lqd.d;
        }
        return lqdVar2.equals(lqdVar);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, ele] */
    public final boolean p() {
        lqc a = ((ewf) this.e).a();
        if (a != null && this.d.b(a)) {
            return true;
        }
        return false;
    }

    public final void q(lqd lqdVar, els elsVar, int i) {
        amr.j();
        eix eixVar = (eix) ((ewc) this.g).a(lqdVar);
        if (eixVar == null) {
            jer B = B(lqdVar);
            if (B.g()) {
                r(lqdVar, (eix) B.c(), 1);
                eixVar = (eix) B.c();
            } else {
                return;
            }
        }
        eiw b = eixVar.b();
        elsVar.a(b.b());
        eix c = b.c();
        if (!eixVar.equals(c)) {
            r(lqdVar, c, i);
        }
    }

    public final void r(lqd lqdVar, eix eixVar, int i) {
        ((ewc) this.g).r(lqdVar, eixVar);
        if (i - 1 == 2 && o(lqdVar)) {
            j();
        }
        ((dhx) this.f).i();
        if (i != 3 && o(lqdVar)) {
            ((dhx) this.a).i();
        }
    }

    public final edy s(lqd lqdVar) {
        lqc t;
        edy edyVar;
        lpw lpwVar;
        boolean z;
        lqc lqcVar = null;
        if (lqdVar.a != 5 || (t = t(lqdVar)) == null) {
            return null;
        }
        Parcelable a = ((ewc) this.g).a(lqdVar);
        if (a instanceof edy) {
            edyVar = (edy) a;
        } else {
            edyVar = null;
        }
        if (edyVar == null) {
            if (t.b == 10) {
                lpwVar = (lpw) t.c;
            } else {
                lpwVar = lpw.i;
            }
            long j = lpwVar.b;
            if (j != 0) {
                lqcVar = u(j);
            }
            lqc lqcVar2 = lqcVar;
            if (lqcVar2 != null) {
                z = x(lqcVar2);
            } else {
                z = false;
            }
            edyVar = new edy(null, null, lqcVar2, z, null, null, false, null, null, 499);
            lqd lqdVar2 = t.d;
            if (lqdVar2 == null) {
                lqdVar2 = lqd.d;
            }
            lqdVar2.getClass();
            w(lqdVar2, edyVar);
        }
        return edyVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ewg, java.lang.Object] */
    public final lqc t(lqd lqdVar) {
        return bse.f((lqc) eyf.b(this.a.c(), lqdVar).f());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ewg, java.lang.Object] */
    public final lqc u(long j) {
        boolean z;
        lpp lppVar;
        jis<lqc> c = this.a.c();
        int i = eyf.a;
        if (c == null) {
            return null;
        }
        for (lqc lqcVar : c) {
            if (eyf.q(lqcVar)) {
                lqd lqdVar = lqcVar.d;
                if (lqdVar == null) {
                    lqdVar = lqd.d;
                }
                if (hzc.am(lqdVar.a) == 2) {
                    z = true;
                } else {
                    z = false;
                }
                hwx.K(z, "Device is not an android device");
                if (lqdVar.a == 1) {
                    lppVar = (lpp) lqdVar.b;
                } else {
                    lppVar = lpp.d;
                }
                if (lppVar.b == j) {
                    return lqcVar;
                }
            }
        }
        return null;
    }

    public final void v(lqd lqdVar, moh mohVar) {
        edy edyVar;
        if (lqdVar.a == 5) {
            Parcelable a = ((ewc) this.g).a(lqdVar);
            if (a instanceof edy) {
                edyVar = (edy) a;
            } else {
                edyVar = null;
            }
            if (edyVar == null) {
                edyVar = new edy(null, null, null, false, null, null, false, null, null, 511);
                w(lqdVar, edyVar);
            }
            eeh eehVar = new eeh(edyVar);
            mohVar.a(eehVar);
            edy c = eehVar.c();
            if (!amr.i(edyVar, c)) {
                w(lqdVar, c);
            }
        }
    }

    public final void w(lqd lqdVar, edy edyVar) {
        lqd lqdVar2;
        ((ewc) this.g).r(lqdVar, edyVar);
        lqc a = ((ewf) this.e).a();
        if (a != null) {
            lqdVar2 = a.d;
            if (lqdVar2 == null) {
                lqdVar2 = lqd.d;
            }
        } else {
            lqdVar2 = null;
        }
        if (amr.i(lqdVar2, lqdVar)) {
            ((myu) this.b).e(edyVar);
        }
    }

    public final boolean x(lqc lqcVar) {
        return eyf.r(lqcVar, ((elo) this.d).h());
    }

    public final void y() {
        if (!z()) {
            return;
        }
        ((WindowManager) ((Context) this.g).getSystemService("window")).removeView((View) this.b);
    }

    public final boolean z() {
        if (((View) this.b).getParent() != null) {
            return true;
        }
        return false;
    }

    public ilv(Context context, hph hphVar, eld eldVar, cur curVar, WorkDatabase workDatabase, cvu cvuVar, List list) {
        context.getClass();
        workDatabase.getClass();
        this.e = hphVar;
        this.f = eldVar;
        this.c = curVar;
        this.b = workDatabase;
        this.d = cvuVar;
        this.a = list;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.g = applicationContext;
        new bph();
    }

    public ilv(ewc ewcVar, ewg ewgVar, ewf ewfVar, elo eloVar, ilv ilvVar) {
        ewcVar.getClass();
        ewgVar.getClass();
        ewfVar.getClass();
        eloVar.getClass();
        ilvVar.getClass();
        this.g = ewcVar;
        this.a = ewgVar;
        this.e = ewfVar;
        this.d = eloVar;
        this.c = ilvVar;
        byte[] bArr = null;
        ewfVar.c(new dym(this, 5, bArr));
        ilvVar.g(new dym(this, 6, bArr));
        myu a = myv.a(C(ewfVar.a()));
        this.b = a;
        this.f = new mya(a);
    }

    public ilv(evy evyVar, ewc ewcVar, ewf ewfVar, ele eleVar) {
        this.b = new ArrayList();
        this.f = new dhx((short[]) null);
        this.a = new dhx((short[]) null);
        this.c = evyVar;
        this.g = ewcVar;
        this.e = ewfVar;
        this.d = eleVar;
        ewfVar.c(new ela(this, 4));
    }

    public ilv(nhk nhkVar, jfe jfeVar, jfe jfeVar2, Executor executor, lqz lqzVar, hpe hpeVar, mko mkoVar) {
        this.b = new AtomicBoolean(true);
        this.f = nhkVar;
        this.e = jfeVar;
        this.g = jfeVar2;
        this.a = executor;
        this.c = hpeVar.a(executor, lqzVar, null);
        this.d = mkoVar;
    }

    public ilv(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, mko mkoVar5, mko mkoVar6, mko mkoVar7) {
        mkoVar.getClass();
        this.e = mkoVar;
        mkoVar2.getClass();
        this.g = mkoVar2;
        mkoVar3.getClass();
        this.f = mkoVar3;
        mkoVar4.getClass();
        this.c = mkoVar4;
        mkoVar5.getClass();
        this.b = mkoVar5;
        mkoVar6.getClass();
        this.d = mkoVar6;
        mkoVar7.getClass();
        this.a = mkoVar7;
    }

    public ilv(Executor executor, kpb kpbVar, imi imiVar, Map map) {
        this.a = new HashMap();
        this.b = new HashMap();
        executor.getClass();
        this.c = executor;
        kpbVar.getClass();
        this.d = kpbVar;
        this.g = imiVar;
        this.f = map;
        hwx.J(!map.isEmpty());
        this.e = new igw(9);
    }
}
