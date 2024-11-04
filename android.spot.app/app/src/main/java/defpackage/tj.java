package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tj implements awh {
    public final to a;

    public tj(to toVar) {
        this.a = toVar;
    }

    @Override // defpackage.awh
    public final awi a(awj awjVar, List list, long j) {
        awr awrVar;
        awr awrVar2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        awi cd;
        int size = list.size();
        awr[] awrVarArr = new awr[size];
        int size2 = list.size();
        long j2 = 0;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            awrVar = null;
            tl tlVar = null;
            if (i7 >= size2) {
                break;
            }
            awg awgVar = (awg) list.get(i7);
            Object c = awgVar.c();
            if (c instanceof tl) {
                tlVar = (tl) c;
            }
            if (tlVar != null && ((Boolean) tlVar.a.a()).booleanValue()) {
                awr l = awgVar.l(j);
                long m = bef.m(l.a, l.b);
                awrVarArr[i7] = l;
                j2 = m;
            }
            i7++;
        }
        int size3 = list.size();
        for (int i8 = 0; i8 < size3; i8++) {
            awg awgVar2 = (awg) list.get(i8);
            if (awrVarArr[i8] == null) {
                awrVarArr[i8] = awgVar2.l(j);
            }
        }
        if (awjVar.n()) {
            i3 = blm.b(j2);
        } else {
            if (size == 0) {
                awrVar2 = null;
            } else {
                awrVar2 = awrVarArr[0];
                int h = mkm.h(awrVarArr);
                if (h != 0) {
                    if (awrVar2 != null) {
                        i = awrVar2.a;
                    } else {
                        i = 0;
                    }
                    mmb it = new mqg(1, h).iterator();
                    while (it.a) {
                        awr awrVar3 = awrVarArr[it.a()];
                        if (awrVar3 != null) {
                            i2 = awrVar3.a;
                        } else {
                            i2 = 0;
                        }
                        if (i < i2) {
                            awrVar2 = awrVar3;
                            i = i2;
                        }
                    }
                }
            }
            if (awrVar2 != null) {
                i3 = awrVar2.a;
            } else {
                i3 = 0;
            }
        }
        if (awjVar.n()) {
            i6 = blm.a(j2);
        } else {
            if (size != 0) {
                awrVar = awrVarArr[0];
                int h2 = mkm.h(awrVarArr);
                if (h2 != 0) {
                    if (awrVar != null) {
                        i4 = awrVar.b;
                    } else {
                        i4 = 0;
                    }
                    mmb it2 = new mqg(1, h2).iterator();
                    while (it2.a) {
                        awr awrVar4 = awrVarArr[it2.a()];
                        if (awrVar4 != null) {
                            i5 = awrVar4.b;
                        } else {
                            i5 = 0;
                        }
                        if (i4 < i5) {
                            awrVar = awrVar4;
                            i4 = i5;
                        }
                    }
                }
            }
            if (awrVar != null) {
                i6 = awrVar.b;
            }
        }
        if (!awjVar.n()) {
            this.a.c.h(new blm(bef.m(i3, i6)));
        }
        cd = awjVar.cd(i3, i6, mly.a, new ti(awrVarArr, this, i3, i6));
        return cd;
    }
}
