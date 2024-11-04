package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajs {
    public static final int a(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final int b(int i) {
        return (i - 1) & (-32);
    }

    public static final Object[] c(Object obj) {
        Object[] objArr = new Object[32];
        objArr[0] = obj;
        return objArr;
    }
}
