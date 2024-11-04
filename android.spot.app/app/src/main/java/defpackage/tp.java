package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tp implements awh {
    private final tw a;
    private boolean b;

    public tp(tw twVar) {
        this.a = twVar;
    }

    @Override // defpackage.awh
    public final awi a(awj awjVar, List list, long j) {
        Object obj;
        int i;
        int i2;
        awi cd;
        int i3;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            arrayList.add(((awg) list.get(i5)).l(j));
        }
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList.get(0);
            int i6 = ((awr) obj).a;
            int O = mkm.O(arrayList);
            if (O > 0) {
                int i7 = 1;
                while (true) {
                    Object obj3 = arrayList.get(i7);
                    int i8 = ((awr) obj3).a;
                    if (i6 < i8) {
                        i = i8;
                    } else {
                        i = i6;
                    }
                    if (i6 < i8) {
                        obj = obj3;
                    }
                    if (i7 == O) {
                        break;
                    }
                    i7++;
                    i6 = i;
                }
            }
        }
        awr awrVar = (awr) obj;
        if (awrVar != null) {
            i2 = awrVar.a;
        } else {
            i2 = 0;
        }
        if (!arrayList.isEmpty()) {
            obj2 = arrayList.get(0);
            int i9 = ((awr) obj2).b;
            int O2 = mkm.O(arrayList);
            if (O2 > 0) {
                int i10 = 1;
                while (true) {
                    Object obj4 = arrayList.get(i10);
                    int i11 = ((awr) obj4).b;
                    if (i9 < i11) {
                        i3 = i11;
                    } else {
                        i3 = i9;
                    }
                    if (i9 < i11) {
                        obj2 = obj4;
                    }
                    if (i10 == O2) {
                        break;
                    }
                    i10++;
                    i9 = i3;
                }
            }
        }
        awr awrVar2 = (awr) obj2;
        if (awrVar2 != null) {
            i4 = awrVar2.b;
        }
        if (awjVar.n()) {
            this.b = true;
            this.a.a.h(new blm(bef.m(i2, i4)));
        } else if (!this.b) {
            this.a.a.h(new blm(bef.m(i2, i4)));
        }
        cd = awjVar.cd(i2, i4, mly.a, new oq(arrayList, 6));
        return cd;
    }
}
