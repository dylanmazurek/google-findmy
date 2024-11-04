package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class yb implements awh {
    public final aoo a;
    private final xo b;

    public yb(xo xoVar, aoo aooVar) {
        this.b = xoVar;
        this.a = aooVar;
    }

    @Override // defpackage.awh
    public final awi a(awj awjVar, List list, long j) {
        awi cd;
        int cj = awjVar.cj(0.0f);
        awr[] awrVarArr = new awr[list.size()];
        int size = list.size();
        int[] iArr = new int[size];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i < size) {
            awg awgVar = (awg) list.get(i);
            Object c = awgVar.c();
            if (c instanceof yg) {
            }
            int b = bld.b(j);
            int a = bld.a(j);
            int i5 = a - i2;
            awr awrVar = awrVarArr[i];
            if (awrVar == null) {
                int i6 = Integer.MAX_VALUE;
                if (a != Integer.MAX_VALUE) {
                    i6 = moz.ac(i5, 0);
                }
                awrVar = awgVar.l(bbc.l(0, b, 0, i6));
            }
            int i7 = awrVar.b;
            int i8 = awrVar.a;
            iArr[i] = i7;
            int min = Math.min(cj, moz.ac(i5 - i7, 0));
            i2 += i7 + min;
            i4 = Math.max(i4, i8);
            awrVarArr[i] = awrVar;
            i++;
            i3 = min;
        }
        int d = bld.d(j);
        int max = Math.max(moz.ac(i2 - i3, 0), bld.c(j));
        int max2 = Math.max(i4, Math.max(d, 0));
        int[] iArr2 = new int[size];
        for (int i9 = 0; i9 < size; i9++) {
            iArr2[i9] = 0;
        }
        this.b.a(max, iArr, iArr2);
        cd = awjVar.cd(max2, max, mly.a, new ya(awrVarArr, this, max2, awjVar, iArr2));
        return cd;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yb)) {
            return false;
        }
        yb ybVar = (yb) obj;
        if (amr.i(this.b, ybVar.b) && amr.i(this.a, ybVar.a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.b + ", horizontalAlignment=" + this.a + ')';
    }
}
