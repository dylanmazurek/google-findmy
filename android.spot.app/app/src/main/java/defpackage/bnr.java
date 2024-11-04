package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bnr {
    static int a;
    public final int c;
    public int d;
    final ArrayList b = new ArrayList();
    ArrayList e = null;
    private int f = -1;

    public bnr(int i) {
        int i2 = a;
        a = i2 + 1;
        this.c = i2;
        this.d = i;
    }

    public final int a(bmo bmoVar, int i) {
        int o;
        int o2;
        if (this.b.size() == 0) {
            return 0;
        }
        ArrayList arrayList = this.b;
        bmw bmwVar = ((bmw) arrayList.get(0)).V;
        bmoVar.k();
        bmwVar.b(bmoVar, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((bmw) arrayList.get(i2)).b(bmoVar, false);
        }
        if (i == 0) {
            bmx bmxVar = (bmx) bmwVar;
            if (bmxVar.au > 0) {
                ce.o(bmxVar, bmoVar, arrayList, 0);
            }
        }
        if (i == 1) {
            bmx bmxVar2 = (bmx) bmwVar;
            if (bmxVar2.av > 0) {
                ce.o(bmxVar2, bmoVar, arrayList, 1);
            }
        }
        try {
            bmoVar.j();
        } catch (Exception e) {
            System.err.println(e.toString() + "\n" + Arrays.toString(e.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.e = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            this.e.add(new ce((bmw) arrayList.get(i3)));
        }
        if (i == 0) {
            bmx bmxVar3 = (bmx) bmwVar;
            o = bmo.o(bmxVar3.K);
            o2 = bmo.o(bmxVar3.M);
            bmoVar.k();
        } else {
            bmx bmxVar4 = (bmx) bmwVar;
            o = bmo.o(bmxVar4.L);
            o2 = bmo.o(bmxVar4.N);
            bmoVar.k();
        }
        return o2 - o;
    }

    public final void b(ArrayList arrayList) {
        int size = this.b.size();
        if (this.f != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                bnr bnrVar = (bnr) arrayList.get(i);
                if (this.f == bnrVar.c) {
                    c(this.d, bnrVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final void c(int i, bnr bnrVar) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            bmw bmwVar = (bmw) arrayList.get(i2);
            bnrVar.d(bmwVar);
            if (i == 0) {
                bmwVar.ap = bnrVar.c;
            } else {
                bmwVar.aq = bnrVar.c;
            }
        }
        this.f = bnrVar.c;
    }

    public final boolean d(bmw bmwVar) {
        if (this.b.contains(bmwVar)) {
            return false;
        }
        this.b.add(bmwVar);
        return true;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        int i = this.d;
        if (i == 0) {
            str = "Horizontal";
        } else if (i == 1) {
            str = "Vertical";
        } else {
            str = "Both";
        }
        sb.append(str);
        sb.append(" [");
        sb.append(this.c);
        sb.append("] <");
        String sb2 = sb.toString();
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            sb2 = sb2 + " " + ((bmw) arrayList.get(i2)).aj;
        }
        return sb2.concat(" >");
    }
}
