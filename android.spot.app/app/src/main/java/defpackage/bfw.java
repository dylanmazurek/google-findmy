package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bfw {
    public final bfx a;
    public final boolean b;
    public final float c;
    public final float d;
    public final int e;
    public final List f;
    public final List g;
    private final int h;

    public bfw(bfx bfxVar, long j, int i, boolean z) {
        boolean z2;
        aql aqlVar;
        int a;
        this.a = bfxVar;
        this.h = i;
        if (bld.d(j) == 0 && bld.c(j) == 0) {
            ArrayList arrayList = new ArrayList();
            List list = bfxVar.c;
            int size = list.size();
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            float f = 0.0f;
            while (i3 < size) {
                bfz bfzVar = (bfz) list.get(i3);
                bga bgaVar = bfzVar.a;
                int b = bld.b(j);
                if (bld.g(j)) {
                    a = moz.ac(bld.a(j) - ((int) Math.ceil(f)), i2);
                } else {
                    a = bld.a(j);
                }
                bfp bfpVar = new bfp((bkd) bgaVar, this.h - i4, z, bbc.o(b, a, 5));
                float b2 = f + bfpVar.b();
                int f2 = i4 + bfpVar.f();
                arrayList.add(new bfy(bfpVar, bfzVar.b, bfzVar.c, i4, f2, f, b2));
                z2 = true;
                if (!bfpVar.h() && (f2 != this.h || i3 == mkm.O(this.a.c))) {
                    i3++;
                    f = b2;
                    i4 = f2;
                    i2 = 0;
                } else {
                    f = b2;
                    i4 = f2;
                    break;
                }
            }
            z2 = false;
            this.d = f;
            this.e = i4;
            this.b = z2;
            this.g = arrayList;
            this.c = bld.b(j);
            List arrayList2 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i5 = 0; i5 < size2; i5++) {
                bfy bfyVar = (bfy) arrayList.get(i5);
                List list2 = bfyVar.g.d;
                ArrayList arrayList3 = new ArrayList(list2.size());
                int size3 = list2.size();
                for (int i6 = 0; i6 < size3; i6++) {
                    aql aqlVar2 = (aql) list2.get(i6);
                    if (aqlVar2 != null) {
                        aqlVar = bfyVar.f(aqlVar2);
                    } else {
                        aqlVar = null;
                    }
                    arrayList3.add(aqlVar);
                }
                mkm.an(arrayList2, arrayList3);
            }
            if (arrayList2.size() < 0) {
                int i7 = -arrayList2.size();
                ArrayList arrayList4 = new ArrayList(i7);
                for (int i8 = 0; i8 < i7; i8++) {
                    arrayList4.add(null);
                }
                arrayList2 = mkm.ac(arrayList2, arrayList4);
            }
            this.f = arrayList2;
            return;
        }
        throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
    }

    public final bfs a() {
        return this.a.a;
    }

    public final void b(int i) {
        if (i >= 0 && i < this.e) {
            return;
        }
        throw new IllegalArgumentException("lineIndex(" + i + ") is out of bounds [0, " + this.e + ')');
    }
}
