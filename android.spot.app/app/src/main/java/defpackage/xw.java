package defpackage;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class xw implements awh {
    public final aon a;
    private final boolean b;

    public xw(aon aonVar, boolean z) {
        this.a = aonVar;
        this.b = z;
    }

    @Override // defpackage.awh
    public final awi a(awj awjVar, List list, long j) {
        long k;
        awi cd;
        awi cd2;
        awi cd3;
        if (list.isEmpty()) {
            cd3 = awjVar.cd(bld.d(j), bld.c(j), mly.a, wo.i);
            return cd3;
        }
        if (this.b) {
            k = j;
        } else {
            k = bld.k(j, 0, 0);
        }
        if (list.size() == 1) {
            awg awgVar = (awg) list.get(0);
            xt.c(awgVar);
            awr l = awgVar.l(k);
            int max = Math.max(bld.d(j), l.a);
            int max2 = Math.max(bld.c(j), l.b);
            cd2 = awjVar.cd(max, max2, mly.a, new xu(l, awgVar, awjVar, max, max2, this));
            return cd2;
        }
        awr[] awrVarArr = new awr[list.size()];
        mpl mplVar = new mpl();
        mplVar.a = bld.d(j);
        mpl mplVar2 = new mpl();
        mplVar2.a = bld.c(j);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            awg awgVar2 = (awg) list.get(i);
            xt.c(awgVar2);
            awr l2 = awgVar2.l(k);
            awrVarArr[i] = l2;
            mplVar.a = Math.max(mplVar.a, l2.a);
            mplVar2.a = Math.max(mplVar2.a, l2.b);
        }
        cd = awjVar.cd(mplVar.a, mplVar2.a, mly.a, new xv(awrVarArr, list, awjVar, mplVar, mplVar2, this));
        return cd;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xw)) {
            return false;
        }
        xw xwVar = (xw) obj;
        if (amr.i(this.a, xwVar.a) && this.b == xwVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + a.i(this.b);
    }

    public final String toString() {
        return "BoxMeasurePolicy(alignment=" + this.a + ", propagateMinConstraints=" + this.b + ')';
    }
}
