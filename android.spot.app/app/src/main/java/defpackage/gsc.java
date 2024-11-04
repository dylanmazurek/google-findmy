package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gsc extends mnp implements mol {
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    final /* synthetic */ Object f;
    private final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gsc(gga ggaVar, gwf gwfVar, String str, lga lgaVar, gnd gndVar, mmx mmxVar, int i) {
        super(2, mmxVar);
        this.g = i;
        this.e = ggaVar;
        this.b = gwfVar;
        this.f = str;
        this.d = lgaVar;
        this.c = gndVar;
    }

    @Override // defpackage.mol
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.g;
        if (i != 0) {
            if (i != 1) {
                return ((gsc) c((msw) obj, (mmx) obj2)).b(mlh.a);
            }
            return ((gsc) c((msw) obj, (mmx) obj2)).b(mlh.a);
        }
        return ((gsc) c((msw) obj, (mmx) obj2)).b(mlh.a);
    }

    /* JADX WARN: Type inference failed for: r10v12, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r10v3, types: [gsb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v8, types: [mnb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, gry] */
    /* JADX WARN: Type inference failed for: r4v0, types: [gwf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [gwf, java.lang.Object] */
    @Override // defpackage.mnj
    public final Object b(Object obj) {
        int i = this.g;
        if (i != 0) {
            if (i != 1) {
                mne mneVar = mne.a;
                int i2 = this.a;
                mjo.o(obj);
                if (i2 == 0) {
                    ?? r10 = this.f;
                    ?? r2 = this.d;
                    ArrayList arrayList = new ArrayList(mkm.ap(r10));
                    for (gwf gwfVar : r10) {
                        if (!r2.containsKey(gwfVar)) {
                            return new gmy(new IllegalStateException("Account to register not found in accounts storage"));
                        }
                        Object obj2 = r2.get(gwfVar);
                        obj2.getClass();
                        arrayList.add((goa) obj2);
                    }
                    List ag = mkm.ag(arrayList);
                    Object obj3 = this.e;
                    Object obj4 = this.b;
                    Object obj5 = this.c;
                    this.a = 1;
                    obj = ((gsz) obj3).a.a(ag, (String) obj4, (lem) obj5, this);
                    if (obj == mneVar) {
                        return mneVar;
                    }
                }
                return obj;
            }
            mne mneVar2 = mne.a;
            if (this.a != 0) {
                mjo.o(obj);
            } else {
                mjo.o(obj);
                Object obj6 = this.e;
                ?? r5 = this.b;
                Object obj7 = this.f;
                Object obj8 = this.d;
                Object obj9 = this.c;
                this.a = 1;
                gnd gndVar = (gnd) obj9;
                gga ggaVar = (gga) obj6;
                obj = fzo.t(ggaVar.e, new gfz(ggaVar, (String) obj7, r5, (lga) obj8, gndVar, null), this);
                if (obj == mneVar2) {
                    return mneVar2;
                }
            }
            return obj;
        }
        mne mneVar3 = mne.a;
        if (this.a != 0) {
            mjo.o(obj);
        } else {
            mjo.o(obj);
            Object obj10 = this.b;
            ?? r3 = this.c;
            ?? r4 = this.d;
            Object obj11 = this.e;
            Object obj12 = this.f;
            this.a = 1;
            obj = ((hri) obj10).b.b(r3, r4, (Bundle) obj11, (Long) obj12, this);
            if (obj == mneVar3) {
                return mneVar3;
            }
        }
        return obj;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, gry] */
    /* JADX WARN: Type inference failed for: r2v1, types: [gwf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [gwf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.Map, java.lang.Object] */
    @Override // defpackage.mnj
    public final mmx c(Object obj, mmx mmxVar) {
        int i = this.g;
        if (i != 0) {
            if (i != 1) {
                ?? r2 = this.f;
                Object obj2 = this.e;
                Object obj3 = this.b;
                return new gsc((Set) r2, (gsz) obj2, (String) obj3, (lem) this.c, (Map) this.d, mmxVar, 2);
            }
            Object obj4 = this.e;
            ?? r22 = this.b;
            Object obj5 = this.f;
            Object obj6 = this.d;
            lga lgaVar = (lga) obj6;
            return new gsc((gga) obj4, (gwf) r22, (String) obj5, lgaVar, (gnd) this.c, mmxVar, 1);
        }
        Object obj7 = this.b;
        ?? r23 = this.c;
        ?? r3 = this.d;
        Object obj8 = this.e;
        return new gsc((hri) obj7, (gry) r23, (gwf) r3, (Bundle) obj8, (Long) this.f, mmxVar, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gsc(hri hriVar, gry gryVar, gwf gwfVar, Bundle bundle, Long l, mmx mmxVar, int i) {
        super(2, mmxVar);
        this.g = i;
        this.b = hriVar;
        this.c = gryVar;
        this.d = gwfVar;
        this.e = bundle;
        this.f = l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gsc(Set set, gsz gszVar, String str, lem lemVar, Map map, mmx mmxVar, int i) {
        super(2, mmxVar);
        this.g = i;
        this.f = set;
        this.e = gszVar;
        this.b = str;
        this.c = lemVar;
        this.d = map;
    }
}
