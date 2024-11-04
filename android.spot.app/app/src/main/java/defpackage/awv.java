package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class awv extends ayp {
    public static final awv a = new awv();

    private awv() {
    }

    @Override // defpackage.awh
    public final awi a(awj awjVar, List list, long j) {
        awi cd;
        awi cd2;
        awi cd3;
        if (list.isEmpty()) {
            cd3 = awjVar.cd(bld.d(j), bld.c(j), mly.a, awu.a);
            return cd3;
        }
        if (list.size() == 1) {
            awr l = ((awg) list.get(0)).l(j);
            cd2 = awjVar.cd(bbc.k(j, l.a), bbc.j(j, l.b), mly.a, new zc(l, 11));
            return cd2;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((awg) list.get(i)).l(j));
        }
        int size2 = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < size2; i4++) {
            awr awrVar = (awr) arrayList.get(i4);
            i2 = Math.max(awrVar.a, i2);
            i3 = Math.max(awrVar.b, i3);
        }
        cd = awjVar.cd(bbc.k(j, i2), bbc.j(j, i3), mly.a, new zc(arrayList, 12));
        return cd;
    }
}
