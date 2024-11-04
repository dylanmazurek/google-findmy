package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class dzj implements mww {
    final /* synthetic */ dzl a;

    public dzj(dzl dzlVar) {
        this.a = dzlVar;
    }

    @Override // defpackage.mww
    public final /* synthetic */ Object dt(Object obj, mmx mmxVar) {
        jis jisVar;
        ezk ezkVar;
        boolean z;
        Collection collection;
        lpt lptVar;
        String str;
        jer jerVar;
        dzu dzuVar = (dzu) obj;
        dzuVar.getClass();
        if (!dzuVar.c && !dzuVar.a) {
            dzl dzlVar = this.a;
            dzi a = dzlVar.a();
            if (dzlVar.b) {
                jisVar = dzuVar.e;
            } else {
                jisVar = dzuVar.d;
            }
            jisVar.getClass();
            boolean z2 = dzuVar.b;
            boolean booleanValue = ((Boolean) dzuVar.h.b(new dvh(6)).e(false)).booleanValue();
            dzt dztVar = (dzt) dzuVar.h.f();
            if (dztVar != null && (jerVar = dztVar.b) != null) {
                ezkVar = (ezk) jerVar.f();
            } else {
                ezkVar = null;
            }
            boolean z3 = dzlVar.b;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : jisVar) {
                if (((dzs) obj2).b) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(mkm.ap(arrayList));
            Iterator it = arrayList.iterator();
            while (true) {
                z = !z2;
                if (!it.hasNext()) {
                    break;
                }
                arrayList2.add(new dzf((dzs) it.next(), z));
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : jisVar) {
                if (!((dzs) obj3).b) {
                    arrayList3.add(obj3);
                }
            }
            ArrayList arrayList4 = new ArrayList(mkm.ap(arrayList3));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList4.add(new dzf((dzs) it2.next(), z));
            }
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = new ArrayList();
            for (Object obj4 : arrayList4) {
                lqc lqcVar = ((dzf) obj4).a.a;
                lqcVar.getClass();
                if (eyf.t(lqcVar)) {
                    arrayList5.add(obj4);
                } else {
                    arrayList6.add(obj4);
                }
            }
            mkw mkwVar = new mkw(arrayList5, arrayList6);
            List<List> P = mkm.P(arrayList2, (List) mkwVar.b, (List) mkwVar.a);
            ArrayList arrayList7 = new ArrayList();
            for (List list : P) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj5 : list) {
                    lqc lqcVar2 = ((dzf) obj5).a.a;
                    lqcVar2.getClass();
                    if (lqcVar2.b == 3) {
                        lptVar = (lpt) lqcVar2.c;
                    } else {
                        lptVar = lpt.C;
                    }
                    lptVar.getClass();
                    lqa ak = hzc.ak(lptVar);
                    if (ak != null) {
                        str = ak.b;
                    } else {
                        str = null;
                    }
                    Object obj6 = linkedHashMap.get(str);
                    if (obj6 == null) {
                        obj6 = new ArrayList();
                        linkedHashMap.put(str, obj6);
                    }
                    ((List) obj6).add(obj5);
                }
                Iterator it3 = linkedHashMap.entrySet().iterator();
                while (it3.hasNext()) {
                    List list2 = (List) ((Map.Entry) it3.next()).getValue();
                    dzf dzfVar = (dzf) mkm.X(list2);
                    if (dzfVar != null) {
                        dzfVar.c = true;
                    }
                    dzf dzfVar2 = (dzf) mkm.aa(list2);
                    if (dzfVar2 != null) {
                        dzfVar2.d = true;
                    }
                }
                ArrayList arrayList8 = new ArrayList();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    String str2 = (String) entry.getKey();
                    List list3 = (List) entry.getValue();
                    if (str2 != null) {
                        collection = mkm.N(new eac(str2, list3.size()));
                    } else {
                        collection = mlx.a;
                    }
                    mkm.an(arrayList8, mkm.ac(collection, list3));
                }
                mkm.an(arrayList7, arrayList8);
            }
            mmg mmgVar = new mmg();
            mmgVar.addAll(arrayList7);
            if (booleanValue) {
                mmgVar.add(new eaf(ezkVar));
            } else if (!z3 && jisVar.size() <= 1) {
                mmgVar.add(eab.a);
            }
            a.a.a(mkm.M(mmgVar));
        }
        return mlh.a;
    }
}
