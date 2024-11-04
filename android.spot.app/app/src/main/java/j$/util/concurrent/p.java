package j$.util.concurrent;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class p {
    l[] a;
    l b = null;
    o c;
    o d;
    int e;
    int f;
    int g;
    final int h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(l[] lVarArr, int i, int i2, int i3) {
        this.a = lVarArr;
        this.h = i;
        this.e = i2;
        this.f = i2;
        this.g = i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public final l a() {
        l[] lVarArr;
        int length;
        int i;
        o oVar;
        o oVar2;
        l lVar = this.b;
        if (lVar != null) {
            lVar = lVar.d;
        }
        while (lVar == null) {
            if (this.f < this.g && (lVarArr = this.a) != null && (length = lVarArr.length) > (i = this.e) && i >= 0) {
                l k = ConcurrentHashMap.k(lVarArr, i);
                if (k != null && k.a < 0) {
                    if (k instanceof g) {
                        this.a = ((g) k).e;
                        o oVar3 = this.d;
                        if (oVar3 != null) {
                            this.d = oVar3.d;
                            oVar2 = oVar3;
                        } else {
                            oVar2 = new Object();
                        }
                        oVar2.c = lVarArr;
                        oVar2.a = length;
                        oVar2.b = i;
                        oVar2.d = this.c;
                        this.c = oVar2;
                        lVar = null;
                    } else if (k instanceof q) {
                        lVar = ((q) k).f;
                    } else {
                        lVar = null;
                    }
                } else {
                    lVar = k;
                }
                if (this.c != null) {
                    while (true) {
                        oVar = this.c;
                        if (oVar == null) {
                            break;
                        }
                        int i2 = this.e;
                        int i3 = oVar.a;
                        int i4 = i2 + i3;
                        this.e = i4;
                        if (i4 < length) {
                            break;
                        }
                        this.e = oVar.b;
                        this.a = oVar.c;
                        oVar.c = null;
                        o oVar4 = oVar.d;
                        oVar.d = this.d;
                        this.c = oVar4;
                        this.d = oVar;
                        length = i3;
                    }
                    if (oVar == null) {
                        int i5 = this.e + this.h;
                        this.e = i5;
                        if (i5 >= length) {
                            int i6 = this.f + 1;
                            this.f = i6;
                            this.e = i6;
                        }
                    }
                } else {
                    int i7 = i + this.h;
                    this.e = i7;
                    if (i7 >= length) {
                        int i8 = this.f + 1;
                        this.f = i8;
                        this.e = i8;
                    }
                }
            } else {
                this.b = null;
                return null;
            }
        }
        this.b = lVar;
        return lVar;
    }
}
