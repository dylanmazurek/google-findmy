package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akr {
    public static final int a(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final Object[] b(Object[] objArr, int i, Object obj, Object obj2) {
        int length = objArr.length;
        Object[] objArr2 = new Object[length + 2];
        mkm.y(objArr, objArr2, 0, i, 6);
        mkm.q(objArr, objArr2, i + 2, i, length);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    public static final Object[] c(Object[] objArr, int i) {
        int length = objArr.length;
        Object[] objArr2 = new Object[length - 2];
        mkm.y(objArr, objArr2, 0, i, 6);
        mkm.q(objArr, objArr2, i, i + 2, length);
        return objArr2;
    }

    public static final Object[] d(Object[] objArr, int i) {
        int length = objArr.length;
        Object[] objArr2 = new Object[length - 1];
        mkm.y(objArr, objArr2, 0, i, 6);
        mkm.q(objArr, objArr2, i, i + 1, length);
        return objArr2;
    }
}
