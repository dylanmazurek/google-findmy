package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bbh implements Comparator {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public bbh(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Comparator] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, mol] */
    /* JADX WARN: Type inference failed for: r0v5, types: [mbw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [mbw, java.lang.Object] */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    for (int i2 = 0; i2 < 2; i2++) {
                        moh mohVar = ((moh[]) this.a)[i2];
                        int C = mjo.C((Comparable) mohVar.a(obj), (Comparable) mohVar.a(obj2));
                        if (C != 0) {
                            return C;
                        }
                    }
                    return 0;
                }
                this.a.a(obj);
                this.a.a(obj2);
                return obj.getClass().getName().compareTo(obj2.getClass().getName());
            }
            sc scVar = bbj.a;
            return ((Number) this.a.a(obj, obj2)).intValue();
        }
        int compare = this.a.compare(obj, obj2);
        if (compare != 0) {
            return compare;
        }
        return mjo.C(Integer.valueOf(((bfh) obj).e), Integer.valueOf(((bfh) obj2).e));
    }

    public /* synthetic */ bbh(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
