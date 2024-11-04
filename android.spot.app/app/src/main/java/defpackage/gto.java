package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gto extends mnp implements mol {
    Object a;
    int b;
    final /* synthetic */ gts c;
    final /* synthetic */ Bundle d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gto(gts gtsVar, Bundle bundle, mmx mmxVar) {
        super(2, mmxVar);
        this.c = gtsVar;
        this.d = bundle;
    }

    @Override // defpackage.mol
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gto) c((msw) obj, (mmx) obj2)).b(mlh.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mnj
    public final Object b(Object obj) {
        LinkedHashMap linkedHashMap;
        mne mneVar = mne.a;
        if (this.b != 0) {
            Object obj2 = this.a;
            mjo.o(obj);
            linkedHashMap = obj2;
        } else {
            mjo.o(obj);
            List<gxa> l = kzy.l(this.d, "GNP_ACCOUNTS_TO_REGISTER", gxa.c, lja.a());
            ArrayList arrayList = new ArrayList(mkm.ap(l));
            for (gxa gxaVar : l) {
                gxaVar.getClass();
                arrayList.add(frx.aB(gxaVar));
            }
            Set aj = mkm.aj(arrayList);
            List<goa> c = this.c.a.c();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(moz.ac(mkm.H(mkm.ap(c)), 16));
            for (goa goaVar : c) {
                linkedHashMap2.put(goaVar.b(), goaVar);
            }
            lgp lgpVar = lgp.values()[this.d.getInt("GNP_REGISTRATION_REASON")];
            gny gnyVar = gny.values()[this.d.getInt("GNP_FCM_TARGET_TYPE")];
            gsr gsrVar = gsr.values()[this.d.getInt("GNP_ACCOUNT_TYPE_GROUP")];
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (Map.Entry entry : linkedHashMap2.entrySet()) {
                if (aj.contains((gwf) entry.getKey())) {
                    linkedHashMap3.put(entry.getKey(), entry.getValue());
                }
            }
            gts gtsVar = this.c;
            this.a = linkedHashMap3;
            this.b = 1;
            Object h = gtsVar.h(aj, linkedHashMap2, lgpVar, gnyVar, gsrVar, this);
            if (h != mneVar) {
                linkedHashMap = linkedHashMap3;
                obj = h;
            } else {
                return mneVar;
            }
        }
        gna gnaVar = (gna) obj;
        this.c.b.w(linkedHashMap, gnaVar);
        return gsa.a.a(gnaVar);
    }

    @Override // defpackage.mnj
    public final mmx c(Object obj, mmx mmxVar) {
        return new gto(this.c, this.d, mmxVar);
    }
}
