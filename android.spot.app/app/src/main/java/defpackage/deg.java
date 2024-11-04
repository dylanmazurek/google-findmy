package defpackage;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class deg implements dem {
    public static final deg a = new deg();
    private static final elo b = elo.J("c", "v", "i", "o");

    private deg() {
    }

    @Override // defpackage.dem
    public final /* bridge */ /* synthetic */ Object a(dep depVar, float f) {
        if (depVar.p() == 1) {
            depVar.g();
        }
        depVar.h();
        List list = null;
        List list2 = null;
        List list3 = null;
        boolean z = false;
        while (depVar.n()) {
            int q = depVar.q(b);
            if (q != 0) {
                if (q != 1) {
                    if (q != 2) {
                        if (q != 3) {
                            depVar.l();
                            depVar.m();
                        } else {
                            list3 = ddw.d(depVar, f);
                        }
                    } else {
                        list2 = ddw.d(depVar, f);
                    }
                } else {
                    list = ddw.d(depVar, f);
                }
            } else {
                z = depVar.o();
            }
        }
        depVar.j();
        if (depVar.p() == 2) {
            depVar.i();
        }
        if (list != null && list2 != null && list3 != null) {
            if (list.isEmpty()) {
                return new dcn(new PointF(), false, Collections.emptyList());
            }
            int size = list.size();
            PointF pointF = (PointF) list.get(0);
            ArrayList arrayList = new ArrayList(size);
            for (int i = 1; i < size; i++) {
                PointF pointF2 = (PointF) list.get(i);
                int i2 = i - 1;
                arrayList.add(new dbi(dew.c((PointF) list.get(i2), (PointF) list3.get(i2)), dew.c(pointF2, (PointF) list2.get(i)), pointF2));
            }
            if (z) {
                PointF pointF3 = (PointF) list.get(0);
                int i3 = size - 1;
                arrayList.add(new dbi(dew.c((PointF) list.get(i3), (PointF) list3.get(i3)), dew.c(pointF3, (PointF) list2.get(0)), pointF3));
            }
            return new dcn(pointF, z, arrayList);
        }
        throw new IllegalArgumentException("Shape data was missing information.");
    }
}
