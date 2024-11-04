package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lbp {
    public final lbl a;
    public Set b;
    public List c;
    private final int d;

    public lbp(lbl lblVar, int i) {
        this.c = null;
        this.a = lblVar;
        this.d = i;
    }

    public final void a(lbl lblVar, Collection collection) {
        double d = lblVar.a;
        lbl lblVar2 = this.a;
        double d2 = lblVar2.c;
        if (d < d2) {
            double d3 = lblVar.c;
            double d4 = lblVar2.a;
            if (d4 < d3) {
                double d5 = lblVar.b;
                double d6 = lblVar2.d;
                if (d5 < d6) {
                    double d7 = lblVar.d;
                    double d8 = lblVar2.b;
                    if (d8 < d7) {
                        List list = this.c;
                        if (list != null) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                ((lbp) it.next()).a(lblVar, collection);
                            }
                            return;
                        }
                        Set<lar> set = this.b;
                        if (set != null) {
                            if (d4 >= d && d2 <= d3 && d8 >= d5 && d6 <= d7) {
                                collection.addAll(set);
                                return;
                            }
                            for (lar larVar : set) {
                                lbm lbmVar = larVar.a;
                                if (lblVar.a(lbmVar.a, lbmVar.b)) {
                                    collection.add(larVar);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final void b(double d, double d2, lar larVar) {
        List list = this.c;
        if (list != null) {
            lbl lblVar = this.a;
            if (d2 < lblVar.f) {
                if (d < lblVar.e) {
                    ((lbp) list.get(0)).b(d, d2, larVar);
                    return;
                } else {
                    ((lbp) list.get(1)).b(d, d2, larVar);
                    return;
                }
            }
            if (d < lblVar.e) {
                ((lbp) list.get(2)).b(d, d2, larVar);
                return;
            } else {
                ((lbp) list.get(3)).b(d, d2, larVar);
                return;
            }
        }
        if (this.b == null) {
            this.b = new LinkedHashSet();
        }
        this.b.add(larVar);
        if (this.b.size() > 50 && this.d < 40) {
            ArrayList arrayList = new ArrayList(4);
            this.c = arrayList;
            lbl lblVar2 = this.a;
            arrayList.add(new lbp(lblVar2.a, lblVar2.e, lblVar2.b, lblVar2.f, this.d + 1));
            List list2 = this.c;
            lbl lblVar3 = this.a;
            list2.add(new lbp(lblVar3.e, lblVar3.c, lblVar3.b, lblVar3.f, this.d + 1));
            List list3 = this.c;
            lbl lblVar4 = this.a;
            list3.add(new lbp(lblVar4.a, lblVar4.e, lblVar4.f, lblVar4.d, this.d + 1));
            List list4 = this.c;
            lbl lblVar5 = this.a;
            list4.add(new lbp(lblVar5.e, lblVar5.c, lblVar5.f, lblVar5.d, this.d + 1));
            Set<lar> set = this.b;
            this.b = null;
            for (lar larVar2 : set) {
                lbm lbmVar = larVar2.a;
                b(lbmVar.a, lbmVar.b, larVar2);
            }
        }
    }

    private lbp(double d, double d2, double d3, double d4, int i) {
        this(new lbl(d, d2, d3, d4), i);
    }
}
