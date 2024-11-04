package j$.util.concurrent;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class g extends l {
    final l[] e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(l[] lVarArr) {
        super(-1, null, null);
        this.e = lVarArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.concurrent.l
    public final l a(int i, Object obj) {
        int length;
        l k;
        Object obj2;
        l[] lVarArr = this.e;
        loop0: while (obj != null && lVarArr != null && (length = lVarArr.length) != 0 && (k = ConcurrentHashMap.k(lVarArr, (length - 1) & i)) != null) {
            do {
                int i2 = k.a;
                if (i2 == i && ((obj2 = k.b) == obj || (obj2 != null && obj.equals(obj2)))) {
                    return k;
                }
                if (i2 < 0) {
                    if (k instanceof g) {
                        lVarArr = ((g) k).e;
                    } else {
                        return k.a(i, obj);
                    }
                } else {
                    k = k.d;
                }
            } while (k != null);
        }
        return null;
    }
}
