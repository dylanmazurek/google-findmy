package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bfx implements bga {
    public final bfs a;
    public final List b;
    public final List c;
    private final mkt d;

    public bfx(bfs bfsVar, bgm bgmVar, List list, ble bleVar, dkr dkrVar) {
        String str;
        List list2;
        int i;
        ArrayList arrayList;
        List list3;
        bgb bgbVar;
        int i2;
        bfs bfsVar2 = bfsVar;
        bgm bgmVar2 = bgmVar;
        this.a = bfsVar2;
        this.b = list;
        mkm.a(3, new azp(this, 8));
        this.d = mkm.a(3, new azp(this, 7));
        bgb bgbVar2 = bgmVar2.c;
        int i3 = bft.a;
        int length = bfsVar2.a.length();
        List list4 = bfsVar2.c;
        list4 = list4 == null ? mlx.a : list4;
        ArrayList arrayList2 = new ArrayList();
        int size = list4.size();
        int i4 = 0;
        int i5 = 0;
        while (i4 < size) {
            bfq bfqVar = (bfq) list4.get(i4);
            bgb bgbVar3 = (bgb) bfqVar.a;
            int i6 = bfqVar.b;
            int i7 = bfqVar.c;
            if (i6 != i5) {
                arrayList2.add(new bfq(bgbVar2, i5, i6));
            }
            arrayList2.add(new bfq(bgbVar2.a(bgbVar3), i6, i7));
            i4++;
            i5 = i7;
        }
        if (i5 != length) {
            arrayList2.add(new bfq(bgbVar2, i5, length));
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add(new bfq(bgbVar2, 0, 0));
        }
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        int size2 = arrayList2.size();
        int i8 = 0;
        while (i8 < size2) {
            bfq bfqVar2 = (bfq) arrayList2.get(i8);
            int i9 = bfqVar2.b;
            int i10 = bfqVar2.c;
            if (i9 != i10) {
                str = bfsVar2.a.substring(i9, i10);
                str.getClass();
            } else {
                str = "";
            }
            if (i9 == i10 || (list2 = bfsVar2.b) == null) {
                i = size2;
                arrayList = arrayList2;
                list3 = null;
                list2 = null;
            } else {
                if (i9 == 0) {
                    if (i10 >= bfsVar2.a.length()) {
                        i = size2;
                        arrayList = arrayList2;
                        list3 = null;
                    } else {
                        i9 = 0;
                    }
                }
                ArrayList arrayList4 = new ArrayList(list2.size());
                int size3 = list2.size();
                int i11 = 0;
                while (i11 < size3) {
                    int i12 = size2;
                    Object obj = list2.get(i11);
                    ArrayList arrayList5 = arrayList2;
                    bfq bfqVar3 = (bfq) obj;
                    int i13 = size3;
                    if (bft.c(i9, i10, bfqVar3.b, bfqVar3.c)) {
                        arrayList4.add(obj);
                    }
                    i11++;
                    size2 = i12;
                    arrayList2 = arrayList5;
                    size3 = i13;
                }
                i = size2;
                arrayList = arrayList2;
                list2 = new ArrayList(arrayList4.size());
                int size4 = arrayList4.size();
                int i14 = 0;
                while (i14 < size4) {
                    bfq bfqVar4 = (bfq) arrayList4.get(i14);
                    list2.add(new bfq(bfqVar4.a, moz.ae(bfqVar4.b, i9, i10) - i9, moz.ae(bfqVar4.c, i9, i10) - i9));
                    i14++;
                    size4 = size4;
                    arrayList4 = arrayList4;
                }
                list3 = null;
            }
            bfs bfsVar3 = new bfs(str, list2, list3, list3);
            bgb bgbVar4 = (bgb) bfqVar2.a;
            if (a.m(bgbVar4.b, Integer.MIN_VALUE)) {
                bgbVar = bgbVar2;
                bgbVar4 = new bgb(bgbVar4.a, bgbVar2.b, bgbVar4.c, bgbVar4.d, bgbVar4.e, bgbVar4.f, bgbVar4.g, bgbVar4.h, bgbVar4.i);
            } else {
                bgbVar = bgbVar2;
            }
            String str2 = bfsVar3.a;
            bgm bgmVar3 = new bgm(bgmVar2.b, bgmVar2.c.a(bgbVar4));
            List c = bfsVar3.c();
            int i15 = bfqVar2.b;
            int i16 = bfqVar2.c;
            ArrayList arrayList6 = new ArrayList(0);
            ArrayList arrayList7 = new ArrayList(arrayList6.size());
            int size5 = arrayList6.size();
            int i17 = 0;
            while (i17 < size5) {
                bfq bfqVar5 = (bfq) arrayList6.get(i17);
                int i18 = bfqVar5.b;
                if (i15 <= i18 && (i2 = bfqVar5.c) <= i16) {
                    arrayList7.add(new bfq(bfqVar5.a, i18 - i15, i2 - i15));
                    i17++;
                    i16 = i16;
                } else {
                    throw new IllegalArgumentException("placeholder can not overlap with paragraph.");
                }
            }
            arrayList3.add(new bfz(new bkd(str2, bgmVar3, c, arrayList7, dkrVar, bleVar), bfqVar2.b, bfqVar2.c));
            i8++;
            bfsVar2 = bfsVar;
            bgmVar2 = bgmVar;
            bgbVar2 = bgbVar;
            size2 = i;
            arrayList2 = arrayList;
        }
        this.c = arrayList3;
    }

    @Override // defpackage.bga
    public final float a() {
        return ((Number) this.d.a()).floatValue();
    }

    @Override // defpackage.bga
    public final float b() {
        throw null;
    }

    @Override // defpackage.bga
    public final boolean c() {
        List list = this.c;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((bfz) list.get(i)).a.c()) {
                return true;
            }
        }
        return false;
    }
}
