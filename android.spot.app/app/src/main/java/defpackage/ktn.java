package defpackage;

import android.content.Context;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ktn {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;

    public ktn(hot hotVar, hot hotVar2, hot hotVar3, jzd jzdVar) {
        this.b = hotVar;
        this.d = hotVar2;
        this.a = hotVar3;
        this.c = jzdVar;
    }

    public final lyt a(ktp ktpVar) {
        String str = ktpVar.b().a;
        lyt lytVar = (lyt) ((ConcurrentHashMap) this.c).get(ktpVar);
        if (lytVar == null) {
            lyt lytVar2 = (lyt) ((ConcurrentHashMap) this.d).get(str);
            if (lytVar2 == null) {
                jin jinVar = new jin();
                jinVar.h(hwx.ah(new hsp(this, 6)));
                if (((ktl) this.a).f == null) {
                    jinVar.h(new kvf(0));
                } else {
                    jinVar.h(new kvf(1));
                    jinVar.h(hwx.ah(new hmk(11)));
                }
                jinVar.h(new kve());
                jinVar.h(hwx.ah(new hmk(12)));
                jinVar.h(hwx.ah(new hsp(this, 4)));
                lytVar2 = mjo.L(new kvl(str, (ktl) this.a), jinVar.g());
                lyt lytVar3 = (lyt) ((ConcurrentHashMap) this.d).putIfAbsent(str, lytVar2);
                if (lytVar3 != null) {
                    lytVar2 = lytVar3;
                }
            }
            lyt L = mjo.L(lytVar2, Arrays.asList(hwx.ah(new hsp(ktpVar, 5))));
            lyt lytVar4 = (lyt) ((ConcurrentHashMap) this.c).putIfAbsent(ktpVar, L);
            if (lytVar4 != null) {
                return lytVar4;
            }
            return L;
        }
        return lytVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    public final Collection b() {
        return this.d.values();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    public final List c(byte[] bArr) {
        List list = (List) this.d.get(knb.b(bArr));
        if (list != null) {
            return list;
        }
        return Collections.emptyList();
    }

    public final boolean d() {
        if (!((kfr) this.a).b.isEmpty()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [jfe, java.lang.Object] */
    public final void e(int i, boolean z, long j, int i2, lhg lhgVar, Boolean bool, Boolean bool2) {
        if (lug.a.a().d((Context) ((hot) this.a).a)) {
            long b = lug.a.a().b((Context) ((hot) this.a).a);
            if (((ddg) this.b).y(b)) {
                ljh k = lhh.h.k();
                if (!k.b.y()) {
                    k.t();
                }
                ljn ljnVar = k.b;
                lhh lhhVar = (lhh) ljnVar;
                lhhVar.a |= 1;
                lhhVar.b = z;
                if (!ljnVar.y()) {
                    k.t();
                }
                ljn ljnVar2 = k.b;
                lhh lhhVar2 = (lhh) ljnVar2;
                lhhVar2.a |= 4;
                lhhVar2.d = j;
                if (i2 != 0) {
                    if (!ljnVar2.y()) {
                        k.t();
                    }
                    lhh lhhVar3 = (lhh) k.b;
                    lhhVar3.c = i2 - 1;
                    lhhVar3.a |= 2;
                }
                if (lhgVar != null) {
                    if (!k.b.y()) {
                        k.t();
                    }
                    lhh lhhVar4 = (lhh) k.b;
                    lhhVar4.e = lhgVar.e;
                    lhhVar4.a |= 8;
                }
                if (bool != null) {
                    boolean booleanValue = bool.booleanValue();
                    if (!k.b.y()) {
                        k.t();
                    }
                    lhh lhhVar5 = (lhh) k.b;
                    lhhVar5.a |= 16;
                    lhhVar5.f = booleanValue;
                }
                if (bool2 != null) {
                    boolean booleanValue2 = bool2.booleanValue();
                    if (!k.b.y()) {
                        k.t();
                    }
                    lhh lhhVar6 = (lhh) k.b;
                    lhhVar6.a |= 32;
                    lhhVar6.g = booleanValue2;
                }
                hot hotVar = (hot) this.d.a();
                ljh k2 = lhn.f.k();
                int i3 = (int) b;
                if (!k2.b.y()) {
                    k2.t();
                }
                ljn ljnVar3 = k2.b;
                lhn lhnVar = (lhn) ljnVar3;
                lhnVar.a |= 1;
                lhnVar.d = i3;
                Object obj = this.c;
                if (!ljnVar3.y()) {
                    k2.t();
                }
                ljn ljnVar4 = k2.b;
                lhn lhnVar2 = (lhn) ljnVar4;
                obj.getClass();
                lhnVar2.e = (lhm) obj;
                lhnVar2.a |= 2;
                if (!ljnVar4.y()) {
                    k2.t();
                }
                lhn lhnVar3 = (lhn) k2.b;
                lhh lhhVar7 = (lhh) k.q();
                lhhVar7.getClass();
                lhnVar3.c = lhhVar7;
                lhnVar3.b = 8;
                hotVar.a(i, (lhn) k2.q());
            }
        }
    }

    public final void f(int i, long j, int i2) {
        e(i, false, j, i2, null, null, null);
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [mko, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [mko, java.lang.Object] */
    public final void g() {
        if (((AtomicBoolean) this.b).getAndSet(true)) {
            return;
        }
        if (!((jer) this.d).g()) {
            ((hpy) ((jeu) this.c).a.a()).k();
        }
        ((hrr) ((jeu) this.a).a.a()).a();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [hjt, java.lang.Object] */
    public final jyz h(jei jeiVar) {
        return iuu.p(this.c.a(), new ejc(this, jeiVar, 17), jxv.a);
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, gsg] */
    public final jyz i(String str, String str2, int i, int i2) {
        if (((jer) this.c).g()) {
            return ((ktn) ((jer) this.c).c()).i(str, str2, i, i2);
        }
        joo jooVar = gvx.a;
        if (str2 != null) {
            return this.a.a((hnu) this.b, new gvx(str2, str, Integer.valueOf(i), Integer.valueOf(i2), true, true));
        }
        throw new NullPointerException("Null url");
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [gur, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, gvl] */
    public final grb j(lcr lcrVar) {
        lcrVar.getClass();
        return new grb(null, lcrVar, 0, (gnv) this.d, (gri) this.a, this.b, this.c);
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [gur, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, gvl] */
    public final grb k(lde ldeVar) {
        ldeVar.getClass();
        return new grb(ldeVar, null, 0, (gnv) this.d, (gri) this.a, this.b, this.c);
    }

    public ktn(huy huyVar, ktn ktnVar, apc apcVar, hot hotVar) {
        this.d = huyVar;
        this.b = ktnVar;
        this.c = apcVar;
        this.a = hotVar;
    }

    public ktn(Map map, iao iaoVar, kuv kuvVar, jzc jzcVar) {
        this.c = map;
        this.d = iaoVar;
        this.b = kuvVar;
        this.a = jzcVar;
    }

    public ktn(Map map, kgi kgiVar, kfr kfrVar, Class cls) {
        this.d = map;
        this.b = kgiVar;
        this.c = cls;
        this.a = kfrVar;
    }

    public ktn() {
        this.b = new HashMap();
        this.a = new HashMap();
        this.d = new HashMap();
        this.c = new HashMap();
    }

    public ktn(fma fmaVar, gnv gnvVar, gri griVar, gur gurVar, gvl gvlVar) {
        fmaVar.getClass();
        gnvVar.getClass();
        gurVar.getClass();
        gvlVar.getClass();
        this.d = gnvVar;
        this.a = griVar;
        this.b = gurVar;
        this.c = gvlVar;
    }

    public ktn(huu huuVar) {
        this.d = new Object();
        this.c = new HashMap();
        this.a = huuVar;
        Context context = huuVar.a;
        this.b = new hus(context.getPackageName(), huuVar.b);
    }

    public ktn(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, char[] cArr) {
        mkoVar.getClass();
        this.d = mkoVar;
        mkoVar2.getClass();
        this.a = mkoVar2;
        mkoVar3.getClass();
        this.c = mkoVar3;
        mkoVar4.getClass();
        this.b = mkoVar4;
    }

    public ktn(Context context, gsg gsgVar, jer jerVar) {
        dhd c = dgo.c(context);
        this.d = c;
        this.b = new hnu(c);
        this.a = gsgVar;
        this.c = jerVar;
    }

    public ktn(ag agVar, hcc hccVar, SelectedAccountDisc selectedAccountDisc) {
        hwx.K(true, "Activity or Fragment should be non-null but not both");
        this.d = agVar;
        hccVar.getClass();
        this.b = hccVar;
        this.a = selectedAccountDisc;
        this.c = new hbq(selectedAccountDisc, hccVar);
    }

    public ktn(jfe jfeVar, ddg ddgVar, hot hotVar, lhm lhmVar) {
        this.d = hwx.H(jfeVar);
        this.b = ddgVar;
        this.a = hotVar;
        this.c = lhmVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Map, java.lang.Object] */
    public ktn(ktn ktnVar) {
        this.b = new HashMap((Map) ktnVar.c);
        this.a = new HashMap((Map) ktnVar.a);
        this.d = new HashMap((Map) ktnVar.b);
        this.c = new HashMap((Map) ktnVar.d);
    }

    public ktn(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, byte[] bArr) {
        mkoVar.getClass();
        this.a = mkoVar;
        mkoVar2.getClass();
        this.c = mkoVar2;
        mkoVar3.getClass();
        this.d = mkoVar3;
        mkoVar4.getClass();
        this.b = mkoVar4;
    }

    public ktn(Context context, hpd hpdVar, hjt hjtVar, hri hriVar) {
        this.d = hpdVar;
        this.c = hjtVar;
        this.a = hriVar;
        this.b = context.getPackageName();
    }

    public ktn(jer jerVar, jer jerVar2, jer jerVar3) {
        this.b = new AtomicBoolean(false);
        this.c = jerVar;
        this.d = jerVar2;
        this.a = jerVar3;
    }

    public ktn(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4) {
        mkoVar.getClass();
        this.b = mkoVar;
        mkoVar2.getClass();
        this.c = mkoVar2;
        mkoVar3.getClass();
        this.a = mkoVar3;
        mkoVar4.getClass();
        this.d = mkoVar4;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Map, java.lang.Object] */
    public ktn(ktn ktnVar, byte[] bArr) {
        this.c = new HashMap((Map) ktnVar.b);
        this.a = new HashMap((Map) ktnVar.a);
        this.b = new HashMap((Map) ktnVar.d);
        this.d = new HashMap((Map) ktnVar.c);
    }

    public ktn(ktl ktlVar, List list) {
        this.c = new ConcurrentHashMap();
        this.d = new ConcurrentHashMap();
        this.a = ktlVar;
        this.b = list;
    }
}
