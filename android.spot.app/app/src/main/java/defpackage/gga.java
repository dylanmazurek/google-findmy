package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gga {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;

    public gga(Object obj, atk atkVar) {
        this.d = atkVar;
        this.g = new uv(atkVar, obj, null, Long.MIN_VALUE, false);
        this.e = new aee(false, agw.a);
        this.h = new aee(obj, agw.a);
        this.a = new bfi((byte[]) null, (byte[]) null);
        va a = a();
        Object obj2 = a instanceof uw ? up.e : a instanceof ux ? up.f : a instanceof uy ? up.g : up.h;
        this.c = obj2;
        va a2 = a();
        Object obj3 = a2 instanceof uw ? up.a : a2 instanceof ux ? up.b : a2 instanceof uy ? up.c : up.d;
        this.i = obj3;
        this.f = obj2;
        this.b = obj3;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [moh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [moh, java.lang.Object] */
    public static /* synthetic */ Object h(gga ggaVar, Object obj, uu uuVar, mmx mmxVar) {
        Object l;
        Object a = ((atk) ggaVar.d).a.a(ggaVar.a());
        Object c = ggaVar.c();
        atk atkVar = (atk) ggaVar.d;
        wa waVar = new wa(uuVar, atkVar, c, obj, (va) atkVar.b.a(a));
        long j = ((uv) ggaVar.g).b;
        l = msz.l(new xg(vr.Default, (bfi) ggaVar.a, new un(ggaVar, a, waVar, j, null), (mmx) null, 1), mmxVar);
        return l;
    }

    public final va a() {
        return ((uv) this.g).a;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [moh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3, types: [moh, java.lang.Object] */
    public final Object b(Object obj) {
        if (!amr.i(this.f, this.c) || !amr.i(this.b, this.i)) {
            va vaVar = (va) ((atk) this.d).b.a(obj);
            int b = vaVar.b();
            boolean z = false;
            for (int i = 0; i < b; i++) {
                if (vaVar.a(i) < ((va) this.f).a(i) || vaVar.a(i) > ((va) this.b).a(i)) {
                    vaVar.e(i, moz.ab(vaVar.a(i), ((va) this.f).a(i), ((va) this.b).a(i)));
                    z = true;
                }
            }
            if (z) {
                return ((atk) this.d).a.a(vaVar);
            }
            return obj;
        }
        return obj;
    }

    public final Object c() {
        return ((uv) this.g).a();
    }

    public final Object d(Object obj, mmx mmxVar) {
        Object l;
        l = msz.l(new xg(vr.Default, (bfi) this.a, new uo(this, obj, null), (mmx) null, 1), mmxVar);
        if (l == mne.a) {
            return l;
        }
        return mlh.a;
    }

    public final void e() {
        uv uvVar = (uv) this.g;
        uvVar.a.d();
        uvVar.b = Long.MIN_VALUE;
        f(false);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [adt, java.lang.Object] */
    public final void f(boolean z) {
        this.e.h(Boolean.valueOf(z));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [adt, java.lang.Object] */
    public final void g(Object obj) {
        this.h.h(obj);
    }

    public gga(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Object obj2 = ((bso) obj).c;
            arrayList.add(obj);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object obj3 = ((bso) it.next()).c;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Object obj4 = ((bso) it2.next()).c;
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            Object obj5 = ((bso) it3.next()).c;
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it4 = list.iterator();
        while (it4.hasNext()) {
            Object obj6 = ((bso) it4.next()).c;
        }
        ArrayList arrayList6 = new ArrayList();
        Iterator it5 = list.iterator();
        while (it5.hasNext()) {
            Object obj7 = ((bso) it5.next()).c;
        }
        ArrayList arrayList7 = new ArrayList();
        Iterator it6 = list.iterator();
        while (it6.hasNext()) {
            Object obj8 = ((bso) it6.next()).c;
        }
        ArrayList arrayList8 = new ArrayList();
        Iterator it7 = list.iterator();
        while (it7.hasNext()) {
            Object obj9 = ((bso) it7.next()).c;
        }
        ArrayList arrayList9 = new ArrayList();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            Object obj10 = ((bso) it8.next()).c;
        }
        this.a = arrayList;
        this.d = arrayList2;
        this.i = arrayList3;
        this.e = arrayList4;
        this.c = arrayList5;
        this.b = arrayList6;
        this.h = arrayList7;
        this.g = arrayList8;
        this.f = arrayList9;
    }

    public gga(lqz lqzVar, ddg ddgVar, ddg ddgVar2, gvi gviVar, ghf ghfVar, fma fmaVar, Random random, mnb mnbVar) {
        lqzVar.getClass();
        ddgVar.getClass();
        ddgVar2.getClass();
        gviVar.getClass();
        ghfVar.getClass();
        fmaVar.getClass();
        random.getClass();
        this.a = lqzVar;
        this.f = ddgVar;
        this.i = ddgVar2;
        this.b = gviVar;
        this.c = ghfVar;
        this.g = fmaVar;
        this.d = random;
        this.e = mnbVar;
        this.h = new ncd();
    }
}
