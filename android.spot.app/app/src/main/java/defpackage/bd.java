package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bd implements bb {
    final /* synthetic */ be a;

    public bd(be beVar) {
        this.a = beVar;
    }

    @Override // defpackage.bb
    public final boolean g(ArrayList arrayList, ArrayList arrayList2) {
        int i;
        be beVar = this.a;
        beVar.e = (f) beVar.b.get(r1.size() - 1);
        ArrayList arrayList3 = beVar.e.d;
        int size = arrayList3.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            ag agVar = ((bm) arrayList3.get(i3)).b;
            if (agVar != null) {
                agVar.t = true;
            }
        }
        boolean af = beVar.af(arrayList, arrayList2, null, -1, 0);
        if (!this.a.j.isEmpty() && arrayList.size() > 0) {
            ((Boolean) arrayList2.get(arrayList.size() - 1)).booleanValue();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size2 = arrayList.size();
            for (int i4 = 0; i4 < size2; i4++) {
                linkedHashSet.addAll(be.ah((f) arrayList.get(i4)));
            }
            ArrayList arrayList4 = this.a.j;
            int size3 = arrayList4.size();
            while (i2 < size3) {
                ba baVar = (ba) arrayList4.get(i2);
                Iterator it = linkedHashSet.iterator();
                while (true) {
                    i = i2 + 1;
                    if (it.hasNext()) {
                        baVar.e();
                    }
                }
                i2 = i;
            }
        }
        return af;
    }
}
