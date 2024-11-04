package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bft {
    public static final /* synthetic */ int a = 0;

    static {
        new bfs("");
    }

    public static final List a(List list, int i, int i2) {
        if (i <= i2) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                Object obj = list.get(i3);
                bfq bfqVar = (bfq) obj;
                if (c(i, i2, bfqVar.b, bfqVar.c)) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i4 = 0; i4 < size2; i4++) {
                bfq bfqVar2 = (bfq) arrayList.get(i4);
                Object obj2 = bfqVar2.a;
                int max = Math.max(i, bfqVar2.b) - i;
                int min = Math.min(i2, bfqVar2.c) - i;
                String str = bfqVar2.d;
                arrayList2.add(new bfq(obj2, max, min, null));
            }
            if (true == arrayList2.isEmpty()) {
                return null;
            }
            return arrayList2;
        }
        throw new IllegalArgumentException(a.ak((byte) 41, i2, i, "start (", ") should be less than or equal to end ("));
    }

    public static final boolean b(int i, int i2, int i3, int i4) {
        boolean z;
        boolean z2;
        if (i > i3 || i4 > i2) {
            return false;
        }
        if (i2 == i4) {
            if (i3 != i4) {
                z = false;
            } else {
                z = true;
            }
            if (i != i2) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z != z2) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static final boolean c(int i, int i2, int i3, int i4) {
        if (Math.max(i, i3) >= Math.min(i2, i4) && !b(i, i2, i3, i4) && !b(i3, i4, i, i2)) {
            return false;
        }
        return true;
    }
}
