package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nqj implements nra {
    private final nra[] a;
    private final int b;

    public nqj(nra[] nraVarArr) {
        int a;
        this.a = nraVarArr;
        int length = nraVarArr.length;
        int i = 0;
        while (true) {
            length--;
            if (length >= 0) {
                nra nraVar = nraVarArr[length];
                if (nraVar != null && (a = nraVar.a()) > i) {
                    i = a;
                }
            } else {
                this.b = i;
                return;
            }
        }
    }

    @Override // defpackage.nra
    public final int a() {
        return this.b;
    }

    @Override // defpackage.nra
    public final int c(nqw nqwVar, CharSequence charSequence, int i) {
        int i2;
        int i3;
        Object b = nqwVar.b();
        boolean z = false;
        Object obj = null;
        int i4 = i;
        int i5 = i4;
        int i6 = 0;
        while (true) {
            nra[] nraVarArr = this.a;
            int length = nraVarArr.length;
            if (i6 >= length) {
                break;
            }
            nra nraVar = nraVarArr[i6];
            if (nraVar == null) {
                if (i4 > i) {
                    z = true;
                } else {
                    return i;
                }
            } else {
                int c = nraVar.c(nqwVar, charSequence, i);
                if (c >= i) {
                    if (c <= i4) {
                        continue;
                    } else {
                        if (c >= charSequence.length() || (i3 = i6 + 1) >= length || nraVarArr[i3] == null) {
                            break;
                        }
                        obj = nqwVar.b();
                        i4 = c;
                    }
                } else if (c < 0 && (i2 = ~c) > i5) {
                    i5 = i2;
                }
                nqwVar.h(b);
                i6++;
            }
        }
        if (i4 <= i && (i4 != i || !z)) {
            return ~i5;
        }
        if (obj != null) {
            nqwVar.h(obj);
        }
        return i4;
    }
}
